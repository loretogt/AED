package aed.cache;

import es.upm.aedlib.Position;
import es.upm.aedlib.map.*;
import es.upm.aedlib.positionlist.*;


public class Cache<Key,Value> {
	private int maxCacheSize;
	private Storage<Key,Value> storage;
	private Map<Key,CacheCell<Key,Value>> map;
	private PositionList<Key> lru;

	public Cache(int maxCacheSize, Storage<Key,Value> storage) {
		this.storage = storage;
		this.map = new HashTableMap<Key,CacheCell<Key,Value>>();
		this.lru = new NodePositionList<Key>();
		this.maxCacheSize = maxCacheSize;
	}

	public Value get(Key key) {
		aux(key);
		return map.get(key).getValue();
	}

	public void put(Key key, Value value) {
		aux(key);

		map.get(key).setValue(value);
		map.get(key).setDirty(true);

	}

	private void aux(Key key ){
		if ( map.get(key)!= null){
			Position<Key> actual= map.get(key).getPos();
			lru.remove(actual);
			lru.addFirst(key);
			map.get(key).setPos(lru.first());
		}
		else{
			if (maxCacheSize == lru.size()){
				if( map.get(lru.last().element()).getDirty()){
					storage.write(lru.last().element(), map.get(lru.last().element()).getValue());
				}
				map.remove(lru.last().element());
				lru.remove(lru.last());
			}
			lru.addFirst(key);
			CacheCell<Key,Value> nuevo= new CacheCell <Key,Value> (storage.read(key), false, lru.first());
			map.put(key, nuevo);

		}
	}
}


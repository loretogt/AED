package aed.mergelists;

import es.upm.aedlib.Position;
import es.upm.aedlib.indexedlist.ArrayIndexedList;
import es.upm.aedlib.indexedlist.IndexedList;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;
import java.util.Comparator;


public class MergeLists {

	/**
	 * Merges two lists ordered using the comparator cmp, returning
	 * a new ordered list.
	 * @returns a new list which is the ordered merge of the two argument lists
	 */
	public static <E> PositionList<E> merge(final PositionList<E> l1,
			final PositionList<E> l2,
			final Comparator<E> comp) {
		
		
		
		PositionList<E> list = new NodePositionList<E>();


		for ( Position<E> cursor1= l1.first(); cursor1!= null  ; cursor1= l1.next(cursor1)){ // Recorre la primera lista
			list.addLast( cursor1.element());
		}


		if( !l2.isEmpty() ){
			Position<E> cursorlist= list.first();
			for ( Position<E> cursor2= l2.first() ;  cursor2!= null  ; cursor2= l2.next(cursor2) ){ // Recorre la segunda  lista
				if  (l1.isEmpty()){
					list.addLast( cursor2.element());
				}
				else{
					while ( cursorlist!= null && comp.compare(cursorlist.element(), cursor2.element())<0 ){
						cursorlist= list.next(cursorlist);
					}
					if ( cursorlist== null){
						list.addLast(cursor2.element());
					}else{
						list.addBefore(cursorlist, cursor2.element());
					}

				}
			}
		}	
		return list;


	}

	/**
	 * Merges two lists ordered using the comparator cmp, returning
	 * a new ordered list.
	 * @returns a new list which is the ordered merge of the two argument lists
	 */
	public static <E> IndexedList<E> merge(final IndexedList<E> l1,
			final IndexedList<E> l2,
			final Comparator<E> comp) {


		IndexedList<E> list = new ArrayIndexedList<E>();

		for ( int pos1=0; pos1<l1.size(); pos1++){
			list.add(pos1, l1.get(pos1));
		}

		if ( ! l2.isEmpty()){
			for ( int pos2=0; pos2<l2.size() ; pos2++){
				if  (l1.isEmpty()){
					list.add(pos2, l2.get(pos2));
				}else{
					int poslist=0;
					while( poslist< list.size()&& comp.compare(list.get(poslist), l2.get(pos2))<0){
						poslist++;
					}

					list.add(poslist, l2.get(pos2));

				}
			}
		}
		return list;

	}



}

package aed.indexedlist;
import es.upm.aedlib.indexedlist.*;

public class Utils {
  public static <E> IndexedList<E> deleteRepeated(IndexedList<E> l) {
      // Hay que modificar este metodo
	  IndexedList<E> list = new ArrayIndexedList<E>(); 
	  for ( int pos = 0; pos< l.size(); pos++){
		  if ( list.indexOf(l.get(pos)) ==-1){
			  list.add(list.size(), l.get(pos));
		  }
	  }
    return list ;
  }
}

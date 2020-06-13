package aed.recursion;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.*;


public class RecursiveUtils {


	/**
	 * Return a^n. 
	 * @return a^n.
	 */
	public static int power(int a, int n) {
		if (n<1)return 1;
		else return a * power(a,n-1);

	}

	/**
	 *  Returns true if the list parameter does not contain a null element.
	 * @return true if the list does not contain a null element.
	 */
	public static <E> boolean allNonNull(PositionList<E> l) {
		if ( l == null) return true ;
		else return allNonNullRec( l, l.first());
	}

	public static <E> boolean allNonNullRec(PositionList<E> l, Position<E> cursor) {

		if (cursor == null) return true; 
		if (cursor.element() == null) return false;
		return allNonNullRec( l, l.next(cursor));



	}


	/**
	 *  Returns the number of non-null elements in the parameter list.
	 * @return the number of non-null elements in the parameter list.
	 */
	public static <E> int countNonNull(PositionList<E> l) {
		if (l == null || l.isEmpty()) return 0;
		else return countNonNullRec( l, l.first(), 0);
	}

	public static <E> int countNonNullRec (PositionList<E> l, Position<E> cursor, int r) {
		if ( cursor == null)return r;
		if ( cursor.element()!= null){
			r++;
		}
		return countNonNullRec( l, l.next(cursor), r);


	}



}

package aed.laberinto;


/**
 * Implements a generic pair of objects.
 */
public class Pair<X,Y> {

	private X left;
	private Y right;

	/**
	 * Constructs a pair from its left and right arguments.
	 */
	public Pair(X left, Y right) {
		this.left = left;
		this.right = right;
	}

	/**
	 * Returns the left component of the pair.
	 * @return the left component of the pair
	 */
	public X getLeft() {
		return left;
	}

	/**
	 * Returns the right component of the pair.
	 * @return the right component of the pair
	 */
	public Y getRight() {
		return right;
	}

	/**
	 * Sets the left component of the tuple to the left parameter.
	 */
	public void setLeft(X left) {
		this.left = left;
	}

	/**
	 * Sets the left component of the tuple to the right parameter.
	 */
	public void setRight(Y right) {
		this.right = right;
	}

	/**
	 * Equality for pairs. Note that the method handles 
	 * the case when the left or right tuple component is <code>null</null>.
	 */
	public boolean equals(Object obj) {
		if (obj instanceof Pair<?,?>) {
			Pair<?,?> p = (Pair<?,?>) obj;
			boolean ok_sofar = true;

			if (left==null) ok_sofar=(p.getLeft()==null);
			else ok_sofar=left.equals(p.getLeft());

			if (ok_sofar) {
				if (right==null) ok_sofar=(p.getRight()==null);
				else ok_sofar=right.equals(p.getRight());
			}

			return ok_sofar;
		} else return false;
	}

	public int hashCode() {
		return left.hashCode() + (37 * right.hashCode());
	}

	public String toString() {
		return "Pair("+left+","+right+")";
	}
}

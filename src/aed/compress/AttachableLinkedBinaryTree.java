package aed.compress;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.*;


public class AttachableLinkedBinaryTree<E> extends LinkedBinaryTree<E> implements AttachableBinaryTree<E> {

	public void attach(Position<E> pos, BinaryTree<E> leftTree, BinaryTree<E> rightTree) {
		if ( isEmpty()){
			return;
		}
		if (leftTree != null && !leftTree.isEmpty()){
			insertLeft(pos, leftTree.root().element());
			attachLeft(pos, leftTree, leftTree.root());


		}
		if( rightTree != null && !rightTree.isEmpty()){
			insertRight(pos, rightTree.root().element());
			attachRight ( pos, rightTree,rightTree.root());
		}
		else return;
	}

	public void attachLeft(Position<E> pos,BinaryTree<E> tree, Position<E>cursor){

		if( tree.hasLeft(cursor)){
			Position<E> cursor1 = tree.left(cursor);
			Position<E> pos1 = left(pos);
			insertLeft( pos1,cursor1.element());
			attachLeft( pos1, tree ,cursor1);

		}
		if( tree.hasRight(cursor)){
			Position<E> cursor1 = tree.right(cursor);
			Position<E> pos1 = left(pos);
			insertRight( pos1, cursor1.element());
			attachRight( pos1, tree , cursor1);


		}
		else return;

	}

	public void attachRight(Position<E> pos,BinaryTree<E> tree,Position<E>cursor ){


		if( tree.hasLeft(cursor)){
			Position<E> cursor1 = tree.left(cursor);
			Position<E> pos1 = right(pos);
			insertLeft( pos1,cursor1.element());
			attachLeft( pos1,tree , cursor1);


		}
		if( tree.hasRight(cursor)){
			Position<E> cursor1 = tree.right(cursor);
			Position<E> pos1 = right(pos);
			insertRight( pos1, cursor1.element());
			attachRight(  pos1,tree , cursor1);


		}


	}
}

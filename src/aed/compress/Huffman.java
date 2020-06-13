package aed.compress;

import es.upm.aedlib.Position;
import es.upm.aedlib.Entry;
import es.upm.aedlib.tree.*;
import es.upm.aedlib.priorityqueue.*;


public class Huffman {
	private BinaryTree<Character> huffmanTree;


	public Huffman(String text) {
		this.huffmanTree = constructHuffmanTree(text);
	}

	private BinaryTree<Character> constructHuffmanTree(String text) {
		PriorityQueue<Integer,BinaryTree<Character>> cola = new SortedListPriorityQueue<Integer,BinaryTree<Character>>();
		int[] arr = countChars(text);
		for( int i=0; i<arr.length; i++){
			if (arr[i]>0){
				AttachableLinkedBinaryTree<Character> arbolito= new AttachableLinkedBinaryTree<Character>();
				arbolito.addRoot((char)i);
				cola.enqueue(arr[i], arbolito);
			}
		}
		while (cola.size()>1){
			Entry<Integer, BinaryTree<Character>> l = cola.dequeue();
			Entry<Integer, BinaryTree<Character>> r = cola.dequeue();
			AttachableLinkedBinaryTree<Character> a= new AttachableLinkedBinaryTree<Character>();
			a.addRoot(' ');
			a.attach(a.root(), l.getValue(), r.getValue());
			cola.enqueue(l.getKey()+ r.getKey(), a);
		}
		huffmanTree = cola.dequeue().getValue();
		return huffmanTree;
	}

	public static int[] countChars(String text) {
		int[] arr = new int[256];
		for ( int i= 0; i< text.length(); i++){
			arr[text.codePointAt(i)] ++;
		}
		return arr;
	}
}




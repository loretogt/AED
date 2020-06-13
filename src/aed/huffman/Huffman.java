package aed.huffman;

import es.upm.aedlib.Position;
import es.upm.aedlib.tree.*;


/**
 * Defines metodos for Huffman encoding of text strings.
 */
public class Huffman {
	private LinkedBinaryTree<Character> huffmanTree;

	public Huffman(LinkedBinaryTree<Character> huffmanTree) {
		// NO CAMBIA ESTE METODO!!! Esta usado durante las pruebas
		this.huffmanTree = huffmanTree;
	}

	/**
	 * Creates a Huffman tree (and stores it in the attribute huffmanTree).
	 * The shape of the (binary) tree is
	 * defined by the array of char-codes.
	 */
	public Huffman(CharCode[] paths) {
		this.huffmanTree= new LinkedBinaryTree<Character>();
		huffmanTree.addRoot(' ');
		for ( int i=0; i< paths.length; i++){
			String bits= paths[i].getCode();
			Position<Character> cursor= huffmanTree.root();
			for ( int j=0; j< bits.length(); j++){
				char c= bits.charAt(j);
				if (c== '0'){
					if(! huffmanTree.hasLeft(cursor)){
						huffmanTree.insertLeft(cursor, ' ');
					}
					cursor= huffmanTree.left(cursor);
					if( j == bits.length()-1){
						huffmanTree.set(cursor, paths[i].getCh());
					}
				}
				else if( c== '1'){
					if( !huffmanTree.hasRight(cursor)){
						huffmanTree.insertRight(cursor, ' ');
					}
					cursor= huffmanTree.right(cursor);
					if (j== bits.length()-1){
						huffmanTree.set(cursor, paths[i].getCh());
					}
				}
			}
		}
	}

	//////////////////////////////////////////////////////////////////////


	/**
	 * Huffman encodes a text, returning a new text string
	 * containing only characters '0' and '1'.
	 */
	public String encode(String text) {
		String code= "";
		for( int i=0; i<text.length(); i++){
			char c= text.charAt(i);
			code+= findCharacterCode( c,huffmanTree, huffmanTree.root(),"" );
		}
		return code;
	}

	// CAMBIA e UTILIZA si quiereis
	private String findCharacterCode(Character ch, 
			BinaryTree<Character> tree,
			Position<Character> pos,
			String path) {
		// Return null if character not found, and otherwise the
		// string of "0" and "1" that lead to the node with the character
		
		if ( tree.hasLeft(pos)){
				Position<Character> pos1= tree.left(pos);
				path= findCharacterCode( ch, tree, pos1, path);
				if ( pos1.element().equals(ch) || path.length()!= 0){
					path= '0'+ path;
					return path;
				}
			}

			if ( tree.hasRight(pos)){
				Position<Character> pos2=  tree.right(pos);
				path= findCharacterCode( ch, tree, pos2, path);
				if ( pos2.element().equals(ch) || path.length()!= 0){	
					path='1'+ path;
					return path;
				}
			}
		return path;
	}


	//////////////////////////////////////////////////////////////////////

	/**
	 * Given the Huffman encoded text argument (a string of only
	 * '0' and '1's), returns the corresponding normal text.
	 */
	public String decode(String encodedText) {
		String palabra= "";
		Position<Character>cursor = huffmanTree.root();
		for ( int i=0; i< encodedText.length(); i++){
			char c= encodedText.charAt(i);
			if (c== '0'){
				cursor= huffmanTree.left(cursor);
				if( !cursor.element().equals(' ')){
					palabra+= cursor.element();
				}
			}
			else if( c== '1'){
				cursor=huffmanTree.right(cursor);
				if( !cursor.element().equals(' ')){
					palabra+= cursor.element();
				}
			}
			if (huffmanTree.isExternal(cursor)){
				cursor=huffmanTree.root();
			}
		}
		return palabra;
	}
}




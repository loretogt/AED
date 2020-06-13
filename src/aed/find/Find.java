package aed.find;

import es.upm.aedlib.tree.Tree;
import es.upm.aedlib.Position;


public class Find {

  /**
   * Busca ficheros con nombre igual que fileName dentro el arbol directory,
   * y devuelve un PositionList con el nombre completo de los ficheros
   * (incluyendo el camino).
   */
  public static void find(String fileName, Tree<String> directory) {
    if ( directory.isEmpty()) return ;
    String currentPath = "";
    findInPos ( directory.root(), currentPath,fileName, directory );
  }
  
  private static void findInPos(Position<String> cursor, String currentPath, String fileName, Tree<String> directory) {
	  if( directory.root().element().equals(fileName)){
		  currentPath= "/"+ directory.root().element();
		  Printer.println(currentPath);
	  }
	  for ( Position <String> w : directory.children(cursor)){
		  if( w.element().equals(fileName)){ 
			  Position<String> pos=w;
			  while (pos!= directory.root() ){ 
				  currentPath =(  "/" + pos.element() )+ currentPath;
				  pos= directory.parent(pos);
			  }
			  currentPath = ("/"+ directory.root().element())+ currentPath;
			  Printer.println(currentPath);
		  }
		  findInPos( w, currentPath,fileName, directory); 
		  
	  }
	
  }
  
}

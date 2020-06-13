package aed.loops;

public class Utils {
	public static int maxNumRepeated(Integer[] l, Integer elem)  {
		int contadorMax =0;
		int consecutivos =0; 
		for ( int pos=0; pos< l.length; pos++){  // recoro el array 
			if ( l[pos].equals(elem) ){ // si en la posicion que estamos el elemento es iguak a elem
				consecutivos++;	 
			}
			if ( !l[pos].equals(elem) || (pos== l.length-1) ) { // si es distinto o es la ultima posicion 
				if ( consecutivos>0){
					if ( consecutivos >= contadorMax){
						contadorMax = consecutivos; 
					}
					consecutivos=0;
				}
			}
			
		}

		return contadorMax ;  
	}
}

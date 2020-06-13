package aed.laberinto;

import java.util.Iterator;

import es.upm.aedlib.lifo.*;
import es.upm.aedlib.positionlist.NodePositionList;
import es.upm.aedlib.positionlist.PositionList;


public class Exploradora {

	/**
	 * Busca un tesoro en el laberinto, empezando en el lugar
	 * inicial: inicialLugar. 
	 * @return un Objeto tesoro encontrado, o null, si ningun
	 * tesoro existe en la parte del laberinto que es alcanzable
	 * desde la posicion inicial.
	 */
	public static Object explora(Lugar inicialLugar) {
		LIFO<Lugar> faltaPorExplorar = new LIFOList<Lugar>();
		faltaPorExplorar.push(inicialLugar);
		while ( !faltaPorExplorar.isEmpty()){
			Lugar l= faltaPorExplorar.pop();
			if (l.sueloMarcadoConTiza()){
				continue;
			}
			if (l.tieneTesoro()){
				l.marcaSueloConTiza();
				return l.getTesoro();
			}
			l.marcaSueloConTiza();
			Iterator<Lugar> cam = l.caminos().iterator();
			while( cam.hasNext()){
				faltaPorExplorar.push(cam.next());
			}  
		}
		return null; 
	}

}







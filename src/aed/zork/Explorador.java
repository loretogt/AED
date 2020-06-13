package aed.zork;

import java.util.Iterator;

import es.upm.aedlib.positionlist.*;

public class Explorador {

	public static Pair<Object,PositionList<Lugar>> explora(Lugar inicialLugar) {
		PositionList<Lugar> lista =new NodePositionList<Lugar>();
		inicialLugar.marcaSueloConTiza();
		Pair<Object,PositionList<Lugar>> res = exploraRec(inicialLugar, lista);
		if(res.getLeft()!=null){
			return res;
		}
		else{
			return null;
		}

	}

	public static Pair<Object,PositionList<Lugar>> exploraRec( Lugar lugarInicial,  PositionList<Lugar> lista) {
		Lugar lugar= lugarInicial;
		Iterator<Lugar> it= lugar.caminos().iterator();
		if(!lugar.sueloMarcadoConTiza()){
			lugar.marcaSueloConTiza();
		}
		if(lugar.tieneTesoro()){
			lista.addLast(lugar);
			return new Pair <Object,PositionList<Lugar>> (lugar.getTesoro(), lista);

		}
		else{
			while(it.hasNext()){
				lugar = it.next();
				if( !lugar.sueloMarcadoConTiza()){
					lugar.marcaSueloConTiza();
					Pair<Object,PositionList<Lugar>> res = exploraRec(lugar, lista);
					if (res.getLeft()!= null){
						res.getRight().addFirst(lugarInicial);
						return res;
					}
				}
			}
		}
		return  new  Pair<Object,PositionList<Lugar>>(null,lista);

	}
}

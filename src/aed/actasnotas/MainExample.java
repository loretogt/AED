package aed.actasnotas;

import java.util.Comparator;

public class MainExample {
	
	public static void main(String[] args) throws CalificacionAlreadyExistsException, InvalidMatriculaException {
		ActaNotas acta = new ActaNotasAED (); 
		
		
		ActaNotasAED actaNotasAED = new ActaNotasAED();
		  actaNotasAED.addCalificacion("Jose Iglesias","1111111",3);
		  actaNotasAED.addCalificacion("Jose Iglesias","1111333",2);
		  System.out.println(actaNotasAED.getCalificacion("1111333"));
		 

		acta.addCalificacion ("Pepe","1",8);
		acta.addCalificacion ("Luis","3",6);
		

		System.out.println("adde Pepe y Luis : " + acta.getCalificaciones(new CompMatricula()));
		
		//acta.addCalificacion ("Paco","3",7); // CalificacionAlreadyExistsException

		System.out.println("getCalificacion(1): " + acta.getCalificacion ("1")); 
		
		//acta.getCalificacion ("2");     // InvalidMatriculaException

		acta.updateNota("1",9);             
		System.out.println("Despues actualizar: " + acta.getCalificaciones(new CompMatricula()));

		//acta.updateNota ("2",4);              // InvalidMatriculaException

		acta.addCalificacion ("Paco","5",3); 

		System.out.println("added Paco (1): " + acta.getCalificaciones(new CompMatricula()));

		System.out.println("Aprobados 5: " + acta.getAprobados(5));     

		System.out.println("Aprobados 3: " + acta.getAprobados (3));    

		System.out.println("Ord nombre : " + acta.getCalificaciones(new CompNombre())); 

		System.out.println("Ord nota : " + acta.getCalificaciones(new CompNota())); 

		acta.deleteCalificacion("1");   
		System.out.println("Despues de borrar " + acta.getCalificaciones(new CompMatricula()));

		//acta.deleteCalificacion("1");  // InvalidMatriculaException

	}
	
	static class CompNombre implements Comparator<Calificacion>{
		@Override
		public int compare(Calificacion c1, Calificacion c2) {
			return c1.getNombre().compareTo(c2.getNombre());
		}
	}

	static class CompMatricula implements Comparator<Calificacion>{
		@Override
		public int compare(Calificacion c1, Calificacion c2) {
			return c1.getMatricula().compareTo(c2.getMatricula());
		}
	}
	static class CompNota implements Comparator<Calificacion>{
		@Override
		public int compare(Calificacion c1, Calificacion c2) {
			return c1.getNota() - c2.getNota();
		}
	}
	
	
}

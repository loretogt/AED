package aed.actasnotas;


import java.util.Comparator;
import aed.actasnotas.Calificacion;
import es.upm.aedlib.indexedlist.ArrayIndexedList;
import es.upm.aedlib.indexedlist.IndexedList;

public class ActaNotasAED implements ActaNotas{

	private IndexedList <Calificacion> notas;

	public ActaNotasAED () { // Constructor de ActaNotasAED
		notas = new ArrayIndexedList<Calificacion>();
	}// de ActaNotasAED

	@Override
	public void addCalificacion(String nombre, String matricula, int nota) throws CalificacionAlreadyExistsException {
		Calificacion calificacionNueva = new Calificacion (nombre, matricula, nota);
		if (notas != null && buscarMatricula(matricula) != -1){ // si la matricula ya existe
			throw new CalificacionAlreadyExistsException ();
		}// de if
		this.notas.add(notas.size(), calificacionNueva);
	}// de addCalification

	private int buscarMatricula (String matricula) {
		int posicion = -1; // si no existe matricula, devuelve -1
		for (int i = 0; i < notas.size(); i++){
			if (notas.get(i).getMatricula().equals(matricula)){
				posicion = i;
			}// de if 
		}// de for
		return posicion;
	}// de buscarMatricula

	@Override
	public void updateNota(String matricula, int nota) throws InvalidMatriculaException {
		if (buscarMatricula(matricula) == -1){ // si no existe la matricula
			throw new InvalidMatriculaException ();
		}// de if
		notas.get(buscarMatricula(matricula)).setNota(nota);
	}// de updateNora

	@Override
	public void deleteCalificacion(String matricula) throws InvalidMatriculaException {
		if (buscarMatricula(matricula) == -1){ // si no existe la matricula
			throw new InvalidMatriculaException ();
		}// de if
		notas.removeElementAt(buscarMatricula(matricula));
	}// de deleteCalificacion

	@Override
	public Calificacion getCalificacion(String matricula) throws InvalidMatriculaException {
		if (buscarMatricula(matricula) == -1){ // si no existe la matricula
			throw new InvalidMatriculaException ();
		}// de if
		return notas.get(buscarMatricula(matricula));
	}// de getCalificacion

	@Override
	public IndexedList<Calificacion> getCalificaciones(Comparator<Calificacion> cmp) {
		IndexedList <Calificacion> calificaciones = new ArrayIndexedList<Calificacion>();
		if (notas.isEmpty()){ // si está vacía, se devuelve vacía
			return calificaciones;
		}// de if
		calificaciones.add(0, notas.get(0));
		for (int i = 1; i < notas.size(); i++){ // se parte del segundo elemento de "notas"
			int posicion = calificaciones.size()-1; // se añade el primer elemento
			while (cmp.compare(notas.get(i), calificaciones.get(posicion)) < 0 && posicion > 0){ //se busca la posicion
				posicion--;
			}// de while
			if (cmp.compare(notas.get(i), calificaciones.get(posicion))> 0){
				calificaciones.add(posicion+1, notas.get(i));
			}// de if 
			else {
				calificaciones.add(posicion, notas.get(i));
			}// de else
		}// de for
		return calificaciones;
	}// de getCalificaciones

	@Override
	public IndexedList<Calificacion> getAprobados(int notaMinima) {
		IndexedList <Calificacion> calificacionesNota = new ArrayIndexedList<Calificacion>();
		for (int i = 0; i<notas.size(); i++){
			if (notas.get(i).getNota() >= notaMinima){
			calificacionesNota.add(calificacionesNota.size(), notas.get(i));
			}// de if
		}// de for
		return calificacionesNota;
	}// de getAprobados

}// de ActaNotasAED


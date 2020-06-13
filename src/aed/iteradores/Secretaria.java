package aed.iteradores;


import es.upm.aedlib.positionlist.*;
import java.util.Iterator;


/**
 * Administra una coleccion de asignaturas.
 */
public class Secretaria {
	private static final String AsignaturaAdmin = null;
	private Iterable<AsignaturaAdmin> asignaturas;

	/**
	 * Empieza administrar una coleccion de asignaturas.
	 */
	public Secretaria(Iterable<AsignaturaAdmin> asignaturas) {
		this.asignaturas = asignaturas;
	}

	private AsignaturaAdmin findAsignatura(String asignatura) {
		Iterator<AsignaturaAdmin> it = asignaturas.iterator();
		AsignaturaAdmin res = null; 
		while (it.hasNext() && res == null) {
			AsignaturaAdmin admin = it.next();
			if (admin.getNombreAsignatura().equals(asignatura)) {
				res = admin;
			}
		}
		return res;
	}

	private AsignaturaAdmin getAsignatura(String asignatura)
			throws InvalidAsignaturaException {
		AsignaturaAdmin admin = findAsignatura(asignatura);
		if (admin == null) throw new InvalidAsignaturaException();
		else return admin;
	}


	/**
	 * Matricula una coleccion de alumnos (representados por el
	 * parametro matriculas) en una asignatura.
	 * @return los números de matricula de los alumnos matriculados.
	 * @throws InvalidAsignaturaException si la asignatura no
	 * está siendo administrada por la secretaría.
	 */
	public Iterable<String> matricular(String asignatura, Iterable<String> matriculas)
			throws InvalidAsignaturaException {
		if (findAsignatura(asignatura)== null ){
			throw new InvalidAsignaturaException();
		}
		AsignaturaAdmin admin = getAsignatura(asignatura);
		admin.matricular(matriculas);

		return getAsignatura(asignatura).matricular(matriculas);
	}

	/**
	 * Desmatricula una coleccion de alumnos (representados por el
	 * parametro matriculas) de una asignatura.
	 * @return las matriculas desmatriculados (que debían estar
	 * matriculados y no tener nota).
	 * @throws InvalidAsignaturaException si la asignatura no está
	 * siendo administrado por la secretaria.
	 */
	public Iterable<String> desMatricular(String asignatura, Iterable<String> matriculas)
			throws InvalidAsignaturaException {
		if (findAsignatura(asignatura)== null ){
			throw new InvalidAsignaturaException();
		}
		AsignaturaAdmin admin = getAsignatura(asignatura);
		admin.desMatricular(matriculas);

		return getAsignatura(asignatura).desMatricular(matriculas);
	}

	/**
	 * Calcula la nota media de un alumno (representado por su
	 * identificador de matrícula) en todas asignaturas en las que está
	 * matriculado.  Si el alumno no tiene ninguna nota en ninguna
	 * asignatura, el metodo debe devolver 0.
	 * @return la nota media del alumno.
	 * @throws InvalidMatriculaException 
	 */
	public double notaMediaExpediente (String matricula) {
		Iterator<Pair<String, Integer>> notas;
		notas = expediente(matricula).iterator();
		double nota=0;
		int asignaturas=0;
		while (notas.hasNext()){
			nota += notas.next().getRight();
			asignaturas ++;
		}
		if (asignaturas ==0){
			return 0.0;
		}
		else{
			return nota/asignaturas;
		}


	}

	/**
	 * Devuelve el nombre de la asignatura que tiene la mejor nota
	 * media, calculada usando las notas de todos los alumnos que tienen
	 * notas para esa asignatura.  Si la secretaria no esta
	 * administrando ninguna asignatura, el metodo debe devolver
	 * null. Similarmente, si ningún alumno tiene nota en ninguna
	 * asignatura, el metodo tambien debe devolver null.
	 * @return el nombre de la asignatura con la mejor nota media.
	 * @throws InvalidMatriculaException 
	 */
	public String mejorNotaMedia()  {
		Iterator<AsignaturaAdmin> it = asignaturas.iterator();
		if( it.hasNext()){
			AsignaturaAdmin mejorNota = it.next();
			try {
				if ( !mejorNota.matriculados().iterator().hasNext() ||
						!mejorNota.tieneNota(mejorNota.matriculados().iterator().next()) ){
					if( it.hasNext()){
						mejorNota = it.next();
					}
					else{
						return null;
					}
				}
			} catch (InvalidMatriculaException e) {
				return null;
			}
			while ( it.hasNext()){
				AsignaturaAdmin nota = it.next();
				if ( nota.notaMedia() > mejorNota.notaMedia()){
					mejorNota = nota;
				}
			}
			return mejorNota.getNombreAsignatura();
		}
		return null;
	}

	/**
	 * Devuelve todas las notas de un alumno (representado por su
	 * identificador de matrícula) como una coleccion de objetos
	 * Pair(NombreAsignatura, Nota).
	 * @return una coleccion de pares de las notas de la matricula en
	 * todas las asignaturas.
	 * @throws InvalidMatriculaException 
	 */
	public Iterable<Pair<String,Integer>> expediente(String matricula)  {
		PositionList<Pair<String,Integer>> expediente = new NodePositionList<Pair<String,Integer>>();
		Iterator<AsignaturaAdmin> it = asignaturas.iterator();
		while ( it.hasNext()){
			AsignaturaAdmin asignatura = it.next();
			try {
				if ( asignatura.estaMatriculado(matricula)&& asignatura.tieneNota(matricula)){
					expediente.addLast(new Pair (asignatura.getNombreAsignatura(),asignatura.getNota(matricula)));
				}
			} catch (InvalidMatriculaException e) {
				return null;
			}
		}

		return  expediente;
	}

	/**
	 * Devuelve una coleccion con todas los pares de asignaturas --
	 * representados como Pair(NombreAsignatura1, NombreAsignatura2) --
	 * que no tienen alumnos en comun.  El metodo NO debe devolver nunca
	 * un par Pair(NombreAsignatura,NombreAsignatura), es decir, con
	 * nombres iguales de asignaturas.  Si dos asignaturas A1 y A2 no
	 * tienen ningún alumno en común, para ellas se puede devolver: (i)
	 * Pair(A1,A2), o (ii) Pair(A1,A2), Pair(A2,A1), o (iii)
	 * Pair(A2,A1).
	 * @return una coleccion que contiene todos los pares de asignaturas
	 * que no tienen ningún alumno en comun.
	 */
	public Iterable<Pair<String,String>> asignaturasNoConflictivas () {
		PositionList<Pair<String,String>> asignaturasNoC = new NodePositionList<Pair<String,String>>();
		Iterator<AsignaturaAdmin> it1 = asignaturas.iterator();
		while (it1.hasNext() ){
			AsignaturaAdmin a1 = it1.next();
			Iterator<AsignaturaAdmin> it2 = asignaturas.iterator();
			while (it2.hasNext() && it1.hasNext()){
				AsignaturaAdmin a2 =  it2.next();
				if ( !a1.equals(a2) &&  !compartenAlumnos (a1,a2)){
					asignaturasNoC.addLast(new Pair (a1.getNombreAsignatura(),a2.getNombreAsignatura()));
				}
			}
		}

		return asignaturasNoC;
	}

	/**
	 * Devuelve true si dos asignaturas a1 y a2 tienen algún alumno en
	 * comun.
	 * @return true si las dos asignaturas no tienen ningún alumno en comun.
	 */
	private boolean compartenAlumnos (AsignaturaAdmin a1, AsignaturaAdmin a2) {
		Iterator<String> it1 = a1.matriculados().iterator();
		boolean compartidos = false;
		if ( !it1.hasNext()|| !a2.matriculados().iterator().hasNext()){
			return false;
		}
		while ( it1.hasNext() && !compartidos ) {
			String a11 = it1.next();
			Iterator<String> it2 = a2.matriculados().iterator();
			while ( it2.hasNext() && !compartidos){
				compartidos= (a11.equals(it2.next()));
			}
		}
		return compartidos;
	}

}

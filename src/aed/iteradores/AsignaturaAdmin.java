package aed.iteradores;


import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;


/**
 * Organizes the administration for an asignatura.
 * An asignatura has a name (e.g., "AED"), and the class
 * keeps track of matriculated alumnos, 
 * and of assigned notas for alumnos.
 */
public class AsignaturaAdmin {
    // Name of asignatura
    private String nombreAsignatura;

    // A list of pairs of matricula x nota (integer)
    // Note that the nota should be null if no nota has
    // been assigned yet.
    private PositionList<Pair<String,Integer>> notas;

    /**
     * Creates an asignatura administration object, 
     * where the asignatura has a name (e.g. "AED"),
     * and which keeps tracks of matriculated alumnos, 
     * and assigned notas for alumnos.
     */
    public AsignaturaAdmin(String nombreAsignatura) {
	this.nombreAsignatura = nombreAsignatura;
	this.notas = new NodePositionList<Pair<String,Integer>>();
    }
 
    /**
     * Returns the asignatura name.
     * @return the asignatura name.
     */
    public String getNombreAsignatura() {
	return nombreAsignatura;
    }
    
    /**
     * Returns the matriculados.
     * @return the matriculados.
     */
    public Iterable<String> matriculados() {
	PositionList<String> matriculados =
	    new NodePositionList<String>();
	for (Pair<String,Integer> pair : notas)
	    matriculados.addLast(pair.getLeft());

        return matriculados;
    }

    /**
     * Adds a number of alumnos (defined her/his its matricula)
     * to the asignatura. Returns  a list of the alumnos that were added,
     * i.e., alumnos whose matriculas were had not already been added.
     * @return a list of the alumnos that were added.
     */
    public Iterable<String> matricular(Iterable<String> matriculas) {
	PositionList<String> result = new NodePositionList<String>();

	for (String matricula : matriculas) {
	    if (matricularAlumno(matricula)) 
		result.addLast(matricula);
	}
	return result;
    }

    private boolean matricularAlumno(String matricula) {
	Position<Pair<String,Integer>> cursor = notas.first();
	boolean added = false;
	Pair<String,Integer> newPair = new Pair<String,Integer>(matricula,null);
    
	while (cursor != null && !added) {
	    Pair<String,Integer> pair = cursor.element();
	    int result = matricula.compareTo(pair.getLeft());
	    if (result == 0)
		return false;
	    if (result < 0) {
		notas.addBefore(cursor,newPair);
		added = true;
	    }
	    cursor = notas.next(cursor);
	}

	if (!added) notas.addLast(newPair);
	return true;
    }

    /**
     * Removes an alumno (defined by her/his maricula) from
     * the asignatura.
     */
    public Iterable<String> desMatricular(Iterable<String> matriculas) {
	PositionList<String> result = new NodePositionList<String>();

	for (String matricula : matriculas) {
	    if (desMatricularAlumno(matricula))
		result.addLast(matricula);
	}
	return result;
    }
	
    private boolean desMatricularAlumno(String matricula) {
	Position<Pair<String,Integer>> pos = findMatricula(matricula);

	if (pos == null) return false;
	else {
	    Integer nota = pos.element().getRight();
	    if (nota == null) {
		notas.remove(pos);
		return true;
	    } else return false;
	}
    }
	

    /**
     * Returns the position (in the notas positionlist) where a pair with
     * the matricula as the left component is found. If the matricula is not 
     * found, null is returned. 
     * @return the position with a pair with the matricula, and null
     * if no pair with the matricula was found.
     */
    private Position<Pair<String,Integer>> findMatricula(String matricula) {
	Position<Pair<String,Integer>> cursor = notas.first();

	while (cursor != null) {
	    Pair<String,Integer> pair = cursor.element();
	    if (pair.getLeft().equals(matricula)) return cursor;
            cursor = notas.next(cursor);
	}

	return null;
    }

    /**
     * Checks whether an alumno (defined by her/his maricula) 
     * is matriculated in the asignature.
     * @return true if the alumno is matriculated, and false otherwise.
     */
    public boolean estaMatriculado(String matricula) {
	Position<Pair<String,Integer>> pos = findMatricula(matricula);

	return pos != null;
    }

    /**
     * Checks whether an alumno (defined by her/his maricula) 
     * has a nota.
     * @return true if the alumno has a nota, and false otherwise.
     * @throws InvalidMatriculaException if the student is not matriculated
     */
    public boolean tieneNota(String matricula) throws InvalidMatriculaException {
	Position<Pair<String,Integer>> pos = findMatricula(matricula);

	if (pos == null) throw new InvalidMatriculaException();

	return pos.element().getRight() != null;
    }

    /**
     * Returns the nota of an alumno (identified by her/his matricula).
     * @return the nota of an alumno.
     * @throws InvalidMatriculaException if the alumno has no nota assigned,
     * or is not matriculated.
     */
    public int getNota(String matricula) throws InvalidMatriculaException {
	Position<Pair<String,Integer>> pos = findMatricula(matricula);

	if (pos == null) throw new InvalidMatriculaException();

	Integer nota = pos.element().getRight();
	if (nota == null) throw new InvalidMatriculaException();
	else return nota;
    }

    /**
     * Assigns a nota for an alumno (identified by her/his matricula).
     * @throws InvalidMatriculaException if the alumno is not matriculated.
     */
    public void setNota(String matricula, int nota) throws InvalidMatriculaException {
	Position<Pair<String,Integer>> pos = findMatricula(matricula);

	if (pos == null) throw new InvalidMatriculaException();
	Pair<String,Integer> pair = pos.element();
	pair.setRight(nota);
    }

    /**
    * Returns a list with the alumnos matriculados (their matriculas).
    * @return a list with the alumnos matriculados (their matriculas).
    */
    public Iterable<String> alumnosEnRango(int minNota, int maxNota) {
	PositionList<String> matriculados = new NodePositionList<String>();

	Position<Pair<String,Integer>> cursor = notas.first();
	while (cursor != null) {
	    Integer nota = cursor.element().getRight();
	    if (nota != null && nota >= minNota && nota <= maxNota)
		matriculados.addLast(cursor.element().getLeft());
	    cursor = notas.next(cursor);
	}
	return matriculados;
    }

    /**
     * Calculates the average grade of the notas in the asignatura.
     * NOTE. Does not count alumnos matriculados que no han recibido nota.
     * @return the average grade of the asignatura.
     */
    public double notaMedia() {
	PositionList<String> matriculados = new NodePositionList<String>();
	double numAlumnos = 0;
	double sumGrades = 0;
	Position<Pair<String,Integer>> cursor = notas.first();
	
	while (cursor != null) {
	    Integer nota = cursor.element().getRight();
	    if (nota != null) {
		sumGrades += nota;
		numAlumnos += 1;
	    }
            cursor = notas.next(cursor);
	}
        if (numAlumnos==0) return 0;
	else return sumGrades / numAlumnos;
    }
}


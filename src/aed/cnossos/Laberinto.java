package aed.cnossos;

import es.upm.aedlib.positionlist.*;


/**
 * Implements a labyrinth.
 */
public class Laberinto {
  private Punto[][] cueva;
  private int maxY;
  private int maxX;
  private int y;
  private int x;
  
  /**
   * Constructs a new labyrinth starting from a matrix of points,
   * and the current y and x positions.
   */
  public Laberinto(Punto[][] cueva, int y, int x) {
    this.cueva = cueva;
    this.maxY = cueva.length;
    this.maxX = cueva[0].length;
    this.y = y;
    this.x = x;
  }

  /**
   * Does the current location contain a tesoro?
   * @return true if the current location contains a tesoro
   */
  public boolean tieneTesoro() {
    return cueva[y][x].tieneTesoro();
  }

  /**
   * Return the tesoro in the currrent location, or null if there is none.
   * @return the tesoro in the current location, or null if there is none.
   */
  public Object getTesoro() {
    return cueva[y][x].getTesoro();
  }

  /**
   * Is the floor in the current location marked with "tiza"?
   * @return true if the floor is marked with "tiza"
   */
  public boolean sueloMarcadoConTiza() {
    return cueva[y][x].sueloMarcadoConTiza();
  }

  /**
   * Marks the floor in the current location with "tiza"
   */
  public void marcaSueloConTiza() {
    cueva[y][x].marcaSueloConTiza();
  }

  /**
   * Returns an iterable object which can be used to iterate over
   * the directions (north,south,east,west) which can be directly accessed
   * from the current location.
   */
  public Iterable<PuntoCardinal> caminos() {
    PositionList<PuntoCardinal> caminos = new NodePositionList<PuntoCardinal>();
    for (PuntoCardinal pc : PuntoCardinal.values()) {
      if (cueva[y][x].accessible(pc))
        caminos.addLast(pc);
    }
    return caminos;
  }

  /**
   * Tries to move to the direction indiciated by the pc parameter
   * (without passing other locations on the way).
   * @return true if the move succeeded, and false if not.
   */
  public boolean ir(PuntoCardinal pc) {
    if (cueva[y][x].accessible(pc)) {
      switch (pc) {
      case NORTE: y = y+1; break;
      case SUR: y = y-1; break;
      case ESTE: x = x+1; break;
      case OESTE: x = x-1; break;
      default: y = y-1;
      }
      return true;
    } else return false;
  }

  /**
   * Returns a string representing the current location
   * @return a string representing the current location
   */
  public String printLocation() {
    return Punto.printPunto(cueva,y,x);
  }

  /**
   * Prints the whole labyrinth.
   */
  public void printLaberinto() {
    Punto.printPuntos(cueva,y,x);
  }
}


package aed.laberinto;

import es.upm.aedlib.positionlist.*;


/**
 * Implementa un lugar dentro el laberinto.
 * Un lugar puede tener un objeto tesoro, 
 * puede tener caminos a otros lugares,
 * y el suelo en el lugar puede ser marcado con tiza.
 */
public class Lugar {
  private Punto[][] cueva;
  private int maxY;
  private int maxX;
  private int y;
  private int x;

  public Lugar(Punto[][] cueva, int y, int x) {
    this.cueva = cueva;
    this.maxY = cueva.length;
    this.maxX = cueva[0].length;
    this.y = y;
    this.x = x;
  }

  /**
   * Contiene el lugar un tesoro?
   * @return true si el lugar contiene un (objeto) tesoro
   */
  public boolean tieneTesoro() {
    return cueva[y][x].tieneTesoro();
  }

  /**
   * Devuelve el objeto tesoro dentro del lugar, si existe.
   * @return el objeto tesoro dentro el lugar, o null si no hay
   * ningun objeto tesoro.
   */
  public Object getTesoro() {
    return cueva[y][x].getTesoro();
  }

  /**
   * Esta marcado el suelo dentro el lugar con tiza?
   * @return true si el suelo esta marcado con tiza, y false si no.
   */
  public boolean sueloMarcadoConTiza() {
    return cueva[y][x].sueloMarcadoConTiza();
  }

  /**
   * Marca el suelo con tiza.
   */
  public void marcaSueloConTiza() {
    cueva[y][x].marcaSueloConTiza();
  }

  /**
   * Devuelve un objeto iterable que enumera los lugares vecinos
   * que son alcanzables desde el lugar.
   * @return los lugares vecinos.
   */
  public Iterable<Lugar> caminos() {
      PositionList<Lugar> caminos = new NodePositionList<Lugar>();
      for (PuntoCardinal pc : PuntoCardinal.values()) {
        Lugar lugarNuevo = ir(pc);
	  if (lugarNuevo != null)
	      caminos.addLast(lugarNuevo);
      }
      return caminos;
  }

  /**
   * Devuelve un String con una representacion textual del lugar.
   * @return un String que representa el lugar.
   */
  public String toString() {
    String result = "{x="+x+","+"y="+y+"}";
    if (sueloMarcadoConTiza())
      result += ", esta marcado con tiza";
    if (tieneTesoro())
      result += ", hay un tesoro="+getTesoro();

    return result;
  }

  /**
   * Imprime el laberinto, incluyendo el lugar actual.
   */
  public void printLaberinto() {
    Punto.printPuntos(cueva,y,x);
  }


  private Lugar ir(PuntoCardinal pc) {
    int nuevoY = y;
    int nuevoX = x;
	
    switch (pc) {
    case NORTE: nuevoY = y+1; break;
    case SUR: nuevoY = y-1; break;
    case ESTE: nuevoX = x+1; break;
    case OESTE: nuevoX = x-1; break;
    default: nuevoY = y-1;
    }

    if (cueva[y][x].accessible(pc)) {
      if (nuevoY >= 0 && nuevoY < maxY && nuevoX >= 0 && nuevoX < maxX)
        return new Lugar(cueva,nuevoY,nuevoX);
      else
        return null;
    } else return null;
  }

}


package aed.zork;

import es.upm.aedlib.positionlist.*;


public class Lugar {
  Punto[][] cueva;
  int maxY;
  int maxX;
  int y;
  int x;

  public Lugar(Punto[][] cueva, int y, int x) {
    this.cueva = cueva;
    this.maxY = cueva.length;
    this.maxX = cueva[0].length;
    this.y = y;
    this.x = x;
  }

  public boolean tieneTesoro() {
    return cueva[y][x].tieneTesoro();
  }

  public Object getTesoro() {
    return cueva[y][x].getTesoro();
  }

  public boolean sueloMarcadoConTiza() {
    return cueva[y][x].sueloMarcadoConTiza();
  }

  public void marcaSueloConTiza() {
    cueva[y][x].marcaSueloConTiza();
  }

  public Iterable<Lugar> caminos() {
      PositionList<Lugar> caminos = new NodePositionList<Lugar>();
      for (PuntoCardinal pc : PuntoCardinal.values()) {
        Lugar lugarNuevo = ir(pc);
	  if (lugarNuevo != null)
	      caminos.addLast(lugarNuevo);
      }
      return caminos;
  }

  Lugar ir(PuntoCardinal pc) {
    int nuevoY = y;
    int nuevoX = x;
    boolean enabled;
	
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

  public String toString() {
    String result = "<<{x="+x+","+"y="+y+"}";
    if (sueloMarcadoConTiza())
      result += ", esta marcado con tiza";
    if (tieneTesoro())
      result += ", hay un tesoro="+getTesoro();
    result += ">>";

    return result;
  }

  public void printLaberinto() {
    Punto.printPuntos(cueva,y,x);
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj instanceof Lugar) {
      Lugar otherLugar = (Lugar) obj;
      return
	(this.x == otherLugar.x)
	&& (this.y == otherLugar.y);
    } else return false;
  }

  public int hashCode() {
    return this.x + this.y;
  }
}


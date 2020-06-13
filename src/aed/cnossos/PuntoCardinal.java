package aed.cnossos;

public enum PuntoCardinal {
  NORTE, SUR, ESTE, OESTE;

  /**
   * Returns the opposite direction of the argument.
   * For example, if the argument is south, the method returns north.
   * @return the opposite direction of the argument.
   */
  public static PuntoCardinal opuesto(PuntoCardinal pc) {
    switch (pc) {
    case NORTE: return SUR;
    case SUR: return NORTE;
    case ESTE: return OESTE;
    case OESTE: return ESTE;
    default: return SUR;
    }
  }

}



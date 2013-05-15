package proyectos;

public class TareaSimple implements Tarea {

  private int tiempo;
  private Complejidad complejidad;

  public TareaSimple(int tiempo, Complejidad complejidad) {
    this.tiempo = tiempo;
    this.complejidad = complejidad;
  }

  public double getCosto() {
    return complejidad.getCosto(tiempo);
  }

}

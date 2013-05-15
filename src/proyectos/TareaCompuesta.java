package proyectos;

import java.util.Collection;

public class TareaCompuesta implements Tarea {

  private int tiempo;
  private Collection<Tarea> subtareas;

  public TareaCompuesta(int tiempo, Collection<Tarea> subtareas) {
    this.tiempo = tiempo;
    this.subtareas = subtareas;
  }

  @Override
  public double getCosto() {
    double costoTotal = 0;
    for(Tarea tarea : subtareas) {
      costoTotal += tarea.getCosto();
    }
    return costoTotal;
  }

}

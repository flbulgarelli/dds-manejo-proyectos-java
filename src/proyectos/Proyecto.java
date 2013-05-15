package proyectos;

import java.util.ArrayList;
import java.util.Collection;

public class Proyecto {

  private Collection<Tarea> tareas = new ArrayList<>();

  public int /*double*/ getCostoTotal() {
    int montoTotal = 0;
    for (Tarea tarea : tareas) {
      montoTotal += tarea.getCosto();
    }
    return montoTotal;
  }

  public void addTarea(Tarea tareaSimple) {
    tareas.add(tareaSimple);
  }

}

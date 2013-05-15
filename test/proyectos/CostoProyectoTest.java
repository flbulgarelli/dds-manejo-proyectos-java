package proyectos;

import static junit.framework.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;

public class CostoProyectoTest {
  
  private TareaSimple comprarApuntes = new TareaSimple(10, new ComplejidadMinima());
  private TareaSimple estudiarParaElParcial = new TareaSimple(20, new ComplejidadMedia());

  @Test
  public void elCostoTotalDelProyectoConTareaSimpleYComplejidadMinima() {
    // Fixture = precondicion
    Proyecto aprobarDDS = new Proyecto();
    aprobarDDS.addTarea(comprarApuntes);
    
    // Operacion
    double costo = aprobarDDS.getCostoTotal();
    
    // Asercion = validacion = postcondicion
    assertEquals(250.0, costo);
  }
  
  @Test
  public void elCostoTotalDelProyectoConTareaSimpleYComplejidadMedia() {
    //  Fixture = precondicion
    Proyecto aprobarDDS = new Proyecto();
    aprobarDDS.addTarea(estudiarParaElParcial);
    
    // Operacion
    double costo = aprobarDDS.getCostoTotal();
    
    // Asercion = validacion = postcondicion
    assertEquals(525.0, costo);
  }
  
  @Test
  public void costoDeTareaCompuestaEsSumatoriaDeCostosDeSubtareas() {
    Proyecto aprobarTercero = new Proyecto();
    Collection<Tarea> subtareasDeAprobarDDS = 
      Arrays.<Tarea>asList(comprarApuntes, estudiarParaElParcial);
    
    TareaCompuesta aprobarDDS = new TareaCompuesta(10,  subtareasDeAprobarDDS);
    aprobarTercero.addTarea(aprobarDDS);
    
    int costoTotal = aprobarTercero.getCostoTotal();
    
    assertEquals(
      comprarApuntes.getCosto() + 
      estudiarParaElParcial.getCosto(), (double)costoTotal);
  }
  
}

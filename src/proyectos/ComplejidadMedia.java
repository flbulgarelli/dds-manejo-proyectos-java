package proyectos;

public class ComplejidadMedia implements Complejidad {

  @Override
  public double getCosto(int tiempo) {
    return tiempo * 25 * 1.05;
  }

}

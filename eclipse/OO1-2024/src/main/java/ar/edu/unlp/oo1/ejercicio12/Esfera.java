package ar.edu.unlp.oo1.ejercicio12;

public class Esfera extends Pieza {
  private Integer radio;

  public Esfera(Integer radio, String material, String color) {
    super(material, color);
    this.radio = radio;
  }

  @Override
  public double getSuperficie() {
    return Math.round(4 * Math.PI * Math.pow(radio, 2));
  }

  @Override
  public double getVolumen() {
    return Math.round((4.0 / 3.0) * Math.PI * Math.pow(radio, 3));
  }
}

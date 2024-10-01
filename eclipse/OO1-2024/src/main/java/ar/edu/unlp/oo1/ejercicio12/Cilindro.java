package ar.edu.unlp.oo1.ejercicio12;

public class Cilindro extends Pieza {
  private Integer radio;
  private Integer altura;

  public Cilindro(Integer radio, Integer altura, String material, String color) {
    super(material, color);
    this.radio = radio;
    this.altura = altura;
  }

  @Override
  public double getSuperficie() {
    return Math.round(2 * Math.PI * radio * altura + 2 * Math.PI * Math.pow(radio, 2));
  }

  @Override
  public double getVolumen() {
    return Math.round(Math.PI * Math.pow(radio, 2) * altura);
  }
}

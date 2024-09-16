package ar.edu.unlp.oo1.ejercicio5;

public class Circulo implements Cuerpo2D {

  private double radio;

  public Circulo() {
  }

  public Circulo(double radio) {
    this.radio = radio;
  }

  public double getPerimetro() {
    return getDiametro() * Math.PI;
  }

  public double getArea() {
    return Math.PI * Math.pow(radio, 2);
  }

  public double getDiametro() {
    return radio * 2;
  }

  public void setRadio(double radio) {
    this.radio = radio;
  }

  public double getRadio() {
    return radio;
  }
}

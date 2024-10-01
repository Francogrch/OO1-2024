package ar.edu.unlp.oo1.ejercicio12;

public class PrismaRectangular extends Pieza {
  private Integer ladoMayor;
  private Integer ladoMenor;
  private Integer altura;

  public PrismaRectangular(Integer ladoMayor, Integer ladoMenor, Integer altura, String material, String color) {
    super(material, color);
    this.ladoMayor = ladoMayor;
    this.ladoMenor = ladoMenor;
    this.altura = altura;
  }

  @Override
  public double getSuperficie() {
    return (2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura));
  }

  @Override
  public double getVolumen() {
    return ladoMayor * ladoMenor * altura;
  }
}

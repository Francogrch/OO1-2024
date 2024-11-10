package ar.edu.unlp.oo1.ejercicio23;

public class ExpressDomicilio extends Envio {
  private String domicilioVendedor;
  private String domiciliodComprador;

  public ExpressDomicilio(String domicilioVendedor, String domiciliodComprador) {
    this.domicilioVendedor = domicilioVendedor;
    this.domiciliodComprador = domiciliodComprador;
  }

  public double costo() {
    return CalculadoraDeDistancia.distanciaEntre(domiciliodComprador, domicilioVendedor);
  }
}

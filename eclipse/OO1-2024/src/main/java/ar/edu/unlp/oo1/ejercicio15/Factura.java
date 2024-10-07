package ar.edu.unlp.oo1.ejercicio15;

import java.time.LocalDate;

public class Factura {
  private Usuario usuario;
  private LocalDate fecha;
  private double bonificacion;
  private double montoFinal;
  private static double cuadroTarifario;

  public Factura(Usuario usuario, Consumo consumo) {
    this.usuario = usuario;
    fecha = LocalDate.now();
    montoFinal = (consumo.getEnergiaActiva() * cuadroTarifario);
    if (getFpe(consumo) > 0.8) {
      bonificacion = 1.10;
    } else {
      bonificacion = 1;
    }
    montoFinal = montoFinal * bonificacion;
  }

  private double getFpe(Consumo consumo) {
    return (consumo.getEnergiaActiva())
        / (Math.sqrt((Math.pow(consumo.getEnergiaActiva(), 2) + Math.pow(consumo.getEnergiaReactiva(), 2))));
  }

  public void setCuadroTarifario(double cuadroTarifario) {
    this.cuadroTarifario = cuadroTarifario;
  }

  public Usuario getUsuario() {
    return usuario;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public double getBonificacion() {
    return bonificacion;
  }

  public double getMontoFinal() {
    return montoFinal;
  }

  public static double getCuadroTarifario() {
    return cuadroTarifario;
  }

}

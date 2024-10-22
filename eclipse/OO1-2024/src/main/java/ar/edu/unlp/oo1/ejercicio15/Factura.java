package ar.edu.unlp.oo1.ejercicio15;

import java.time.LocalDate;

public class Factura {
  private Usuario usuario;
  private LocalDate fecha;
  private double bonificacion;
  private double montoFinal;
  private double tarifaActual;

  public Factura(Usuario usuario, Consumo consumo) {
    this.usuario = usuario;
    fecha = LocalDate.now();
    tarifaActual = CuadroTarifario.getTarifa();
    montoFinal = (consumo.getEnergiaActiva() * tarifaActual);
    if (getFpe(consumo) > 0.8) {
      bonificacion = 0.90;
    } else {
      bonificacion = 1;
    }
    montoFinal = montoFinal * bonificacion;
  }

  private double getFpe(Consumo consumo) {
    return (consumo.getEnergiaActiva())
        / (Math.sqrt((Math.pow(consumo.getEnergiaActiva(), 2) + Math.pow(consumo.getEnergiaReactiva(), 2))));
  }

  public double getMontoFinal() {
    return montoFinal;
  }

  public double getBonificacion() {
    return bonificacion;
  }

}

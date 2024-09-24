package ar.edu.unlp.oo1.ejercicio11;

import java.time.LocalDate;

public class PlazoFijo implements Inversion {
  private LocalDate fechaDeConstitucion;
  private double montoDepositado;
  private double porcentajeDeInteresDiario;

  public PlazoFijo(LocalDate fechaDeConstitucion, double montoDepositado, double porcentajeDeInteresDiario) {
    this.fechaDeConstitucion = fechaDeConstitucion;
    this.montoDepositado = montoDepositado;
    this.porcentajeDeInteresDiario = porcentajeDeInteresDiario;
  }

  private int cantDias() {
    LocalDate hoy = LocalDate.now();
    return fechaDeConstitucion.until(hoy).getDays();
  }

  public double valorActual() {
    return (montoDepositado * ((1 + porcentajeDeInteresDiario) * (cantDias())));
  }
}

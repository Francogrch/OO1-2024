package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoPorHoras extends Contrato {
  private int horas;
  private double valorHoras;
  private LocalDate fechaFin;

  public ContratoPorHoras(Empleado empleado, LocalDate fechaInicio, int horas, double valorHoras, LocalDate fechaFin) {
    super(empleado, fechaInicio);
    this.horas = horas;
    this.valorHoras = valorHoras;
    this.fechaFin = fechaFin;
  }

  @Override
  public boolean esVigente() {
    return this.fechaFin.isBefore(LocalDate.now());
  }

  @Override
  public double monto() {
    return horas * valorHoras;
  }

  @Override
  public int mesesTrabajados() {
    return (int) ChronoUnit.MONTHS.between(this.getFechaInicio(), LocalDate.now());
  }

}

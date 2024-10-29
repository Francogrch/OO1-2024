package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ContratoDePlanta extends Contrato {
  private double sueldoMensual, montoConyuge, montoHijos;

  public ContratoDePlanta(Empleado empleado, LocalDate fechaInicio, double sueldoMensual, double montoConyuge,
      double montoHijos) {
    super(empleado, fechaInicio);
    this.sueldoMensual = sueldoMensual;
    this.montoConyuge = montoConyuge;
    this.montoHijos = montoHijos;
  }

  @Override
  public boolean esVigente() {
    return true;
  }

  @Override
  public double monto() {
    return sueldoMensual + (montoConyuge * this.getEmpleado().getConyuge())
        + (this.getEmpleado().getHijos() * montoHijos);
  }

  @Override
  public int mesesTrabajados() {
    return (int) ChronoUnit.MONTHS.between(this.getFechaInicio(), LocalDate.now());
  }

}

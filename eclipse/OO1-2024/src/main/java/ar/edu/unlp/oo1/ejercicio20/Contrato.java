package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;

public abstract class Contrato {
  private Empleado empleado;
  private LocalDate fechaInicio;

  public Contrato(Empleado empleado, LocalDate fechaInicio) {
    this.empleado = empleado;
    this.fechaInicio = fechaInicio;
  }

  public abstract boolean esVigente();

  public abstract double monto();

  public abstract int mesesTrabajados();

  public Empleado getEmpleado() {
    return empleado;
  }

  public LocalDate getFechaInicio() {
    return fechaInicio;
  }

}

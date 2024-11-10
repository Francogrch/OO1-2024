package ar.edu.unlp.oo1.ejercicio24;

import java.time.LocalDate;

public class Vehiculo {
  private String descripcion;
  private int capacidad;
  private int anio;
  private double valor;
  private Conductor duenio;

  public Vehiculo(String descripcion, int capacidad, int anio, double valor, Conductor duenio) {
    this.descripcion = descripcion;
    this.capacidad = capacidad;
    this.anio = anio;
    this.valor = valor;
    this.duenio = duenio;
  }

  public double comision(double monto) {
    double descuento = monto * 0.10;
    if ((LocalDate.now().getYear() - anio) <= 5) {
      descuento = (monto * 0.01);
    }
    return (monto - descuento);
  }

  public double calcularMonto(double monto) {
    return (monto - valor * 0.01);
  }

  public int getCapacidad() {
    return capacidad;
  }

  public Conductor getDuenio() {
    return duenio;
  }

}

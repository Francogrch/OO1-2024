package ar.edu.unlp.oo1.ejercicio19;

import java.time.LocalDate;

public abstract class Envio {
  private LocalDate fecha;
  private String origen, destino;
  private double peso;

  public Envio(LocalDate fecha, String origen, String destino, double peso) {
    this.fecha = fecha;
    this.origen = origen;
    this.destino = destino;
    this.peso = peso;
  }

  public boolean overlap(LocalDate from, LocalDate to) {
    return (fecha.isBefore(to) && fecha.isAfter(from));
  }

  public abstract double monto();

  public double getPeso() {
    return peso;
  }
}

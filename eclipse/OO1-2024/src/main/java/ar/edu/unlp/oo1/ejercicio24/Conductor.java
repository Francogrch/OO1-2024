package ar.edu.unlp.oo1.ejercicio24;

import java.time.LocalDate;

public class Conductor extends Usuario {

  private Vehiculo vehiculo;

  public Conductor(String nombre, double saldo, Vehiculo vehiculo) {
    super(nombre, saldo);
    this.vehiculo = vehiculo;
  }

  public Viaje darAltaViaje(String origen, String destino, LocalDate fecha, double costo) {
    return new Viaje(origen, destino, costo, fecha, vehiculo);
  }

  public double aCobrar(double monto) {
    return vehiculo.calcularMonto(monto);
  }

  public double aIngresar(double monto) {
    return vehiculo.comision(monto);
  }
}

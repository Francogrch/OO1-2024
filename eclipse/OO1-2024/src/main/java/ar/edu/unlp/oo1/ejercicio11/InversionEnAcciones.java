package ar.edu.unlp.oo1.ejercicio11;

public class InversionEnAcciones implements Inversion {
  private String nombre;
  private int cantidad;
  private double valorUnitario;

  public InversionEnAcciones() {
  }

  public InversionEnAcciones(String nombre, int cantidad, double valorUnitario) {
    this.nombre = nombre;
    this.cantidad = cantidad;
    this.valorUnitario = valorUnitario;
  }

  public double valorActual() {
    return cantidad * valorUnitario;
  }
}

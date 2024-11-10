package ar.edu.unlp.oo1.ejercicio24;

public abstract class Usuario {
  private String nombre;
  private double saldo;

  public Usuario(String nombre, double saldo) {
    this.nombre = nombre;
    this.saldo = saldo;
  }

  public void pagar(double monto) {
    saldo -= this.aCobrar(monto);
  }

  public void cargar(double monto) {
    saldo += this.aIngresar(monto);
  }

  public boolean saldoSuficiente(double monto) {
    return (monto <= saldo);
  }

  public abstract double aCobrar(double monto);

  public abstract double aIngresar(double monto);

  public double getSaldo() {
    return saldo;
  }
}

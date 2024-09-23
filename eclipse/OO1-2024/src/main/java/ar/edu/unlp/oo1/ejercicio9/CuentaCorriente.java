package ar.edu.unlp.oo1.ejercicio9;

public class CuentaCorriente extends Cuenta {
  private double descubrimiento;

  public CuentaCorriente() {
    descubrimiento = 0;
  }

  public double getDescubrimiento() {
    return descubrimiento;
  }

  public void setDescubrimiento(double descubrimiento) {
    this.descubrimiento = descubrimiento;
  }

  @Override
  protected boolean puedeExtraer(double monto) {
    return (monto <= this.getSaldo() + descubrimiento);
  }
}

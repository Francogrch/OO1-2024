package ar.edu.unlp.oo1.ejercicio9;

public class CajaDeAhorro extends Cuenta {

  public CajaDeAhorro() {

  }

  @Override
  public boolean extraer(double monto) {
    monto = dos_p(monto);
    return super.extraer(monto);
  }

  @Override
  public boolean transferirACuenta(double monto, Cuenta cuentaDestino) {
    monto = dos_p(monto);
    return super.transferirACuenta(monto, cuentaDestino);
  }

  private double dos_p(double n) {
    return (n + n * (0.02));
  }

  protected boolean puedeExtraer(double monto) {
    return (this.getSaldo() >= monto);
  }
}

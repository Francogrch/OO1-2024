package ar.edu.unlp.oo1.ejercicio15;

public class CuadroTarifario {
  private static double tarifa;

  public CuadroTarifario() {
  }

  public static double getTarifa() {
    return tarifa;
  }

  public void setTarifa(double tarifa) {
    CuadroTarifario.tarifa = tarifa;
  }
}

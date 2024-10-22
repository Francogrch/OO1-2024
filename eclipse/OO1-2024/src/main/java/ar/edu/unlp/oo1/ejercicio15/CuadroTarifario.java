package ar.edu.unlp.oo1.ejercicio15;

public class CuadroTarifario {
  private static double tarifa;

  public CuadroTarifario() {
    tarifa = 10;
  }

  public static double getTarifa() {
    return tarifa;
  }

  public static void setTarifa(double tarifa) {
    CuadroTarifario.tarifa = tarifa;
  }
}

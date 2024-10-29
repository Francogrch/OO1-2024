package ar.edu.unlp.oo1.ejercicio18;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class PoliticaModerada implements PoliticaReserva {

  public double valorReembolso(double monto, LocalDate fechaInicio) {
    int diferencia = (int) ChronoUnit.DAYS.between(fechaInicio, LocalDate.now());
    if (diferencia == 2) {
      return monto * 0.5;
    } else if (diferencia < 7) {
      return monto;
    }
    return 0;
  }
}

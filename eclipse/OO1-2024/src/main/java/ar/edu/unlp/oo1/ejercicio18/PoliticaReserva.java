package ar.edu.unlp.oo1.ejercicio18;

import java.time.LocalDate;

public interface PoliticaReserva {
  public double valorReembolso(double monto, LocalDate fechaInicio);
}

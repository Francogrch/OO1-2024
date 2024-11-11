package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;

public class ConsultaMedica extends Consulta {
  public ConsultaMedica(LocalDate fecha, Mascota mascota, Veterinario veterinario) {
    super(fecha, mascota, veterinario);
  }

  public double costo() {
    double monto = getVeterinario().getHonorario() + 300 + (getVeterinario().getAntiguedad() * 100);
    return esDomingo(getFecha()) ? (monto + 200) : monto;
  }
}

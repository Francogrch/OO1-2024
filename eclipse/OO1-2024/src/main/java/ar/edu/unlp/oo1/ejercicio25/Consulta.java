package ar.edu.unlp.oo1.ejercicio25;

import java.time.DayOfWeek;
import java.time.LocalDate;

public abstract class Consulta extends Servicio {
  private Veterinario veterinario;

  public Consulta(LocalDate fecha, Mascota mascota, Veterinario veterinario) {
    super(fecha, mascota);
    this.veterinario = veterinario;
  }

  public abstract double costo();

  public Veterinario getVeterinario() {
    return veterinario;
  }

  public boolean esDomingo(LocalDate fecha) {
    return fecha.getDayOfWeek().equals(DayOfWeek.SUNDAY);
  }
}

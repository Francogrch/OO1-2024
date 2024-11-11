package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;

public class Vacunacion extends Consulta {
  private String nombre;
  private double costo;

  public Vacunacion(LocalDate fecha, Mascota mascota, Veterinario veterinario, String nombre, double costo) {
    super(fecha, mascota, veterinario);
    this.nombre = nombre;
    this.costo = costo;
  }

  public double costo() {
    double monto = getVeterinario().getHonorario() + 500 + costo;
    return esDomingo(getFecha()) ? (monto + 200) : monto;
  }
}

package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;

public class Veterinario {
  private String nombre;
  private LocalDate fecha;
  private double honorario;

  public Veterinario(String nombre, LocalDate fecha, double honorario) {
    this.nombre = nombre;
    this.fecha = fecha;
    this.honorario = honorario;
  }

  public int getAntiguedad() {
    return LocalDate.now().getYear() - fecha.getYear();
  }

  public double getHonorario() {
    return honorario;
  }
}

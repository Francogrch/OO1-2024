package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;

public abstract class Servicio {
  private LocalDate fecha;
  private Mascota mascota;

  public Servicio(LocalDate fecha, Mascota mascota) {
    this.fecha = fecha;
    this.mascota = mascota;
  }

  public abstract double costo();

  public boolean mismaFecha(LocalDate otraFecha) {
    return fecha.equals(otraFecha);
  }

  public Mascota getMascota() {
    return mascota;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  // Unicamente se utiliza para test
  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }
}

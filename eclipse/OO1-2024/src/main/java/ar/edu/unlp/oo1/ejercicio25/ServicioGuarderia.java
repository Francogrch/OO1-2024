package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;

public class ServicioGuarderia extends Servicio {
  private int cantDias;

  public ServicioGuarderia(LocalDate fecha, Mascota mascota, int cantDias) {
    super(fecha, mascota);
    this.cantDias = cantDias;
  }

  public double costo() {
    return getMascota().utilizoMasDe5() ? ((cantDias * 500) * 0.90) : (cantDias * 500);
  }
}

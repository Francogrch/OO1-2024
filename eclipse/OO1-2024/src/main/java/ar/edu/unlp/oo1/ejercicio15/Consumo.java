package ar.edu.unlp.oo1.ejercicio15;

import java.time.LocalDate;

public class Consumo {
  private int energiaActiva;
  private int energiaReactiva;
  private LocalDate fecha;

  public Consumo(int energiaActiva, int energiaReactiva, LocalDate fecha) {
    this.energiaActiva = energiaActiva;
    this.energiaReactiva = energiaReactiva;
    this.fecha = fecha;
  }

  public int getEnergiaActiva() {
    return energiaActiva;
  }

  public void setEnergiaActiva(int energiaActiva) {
    this.energiaActiva = energiaActiva;
  }

  public int getEnergiaReactiva() {
    return energiaReactiva;
  }

  public void setEnergiaReactiva(int energiaReactiva) {
    this.energiaReactiva = energiaReactiva;
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

}

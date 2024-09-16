package ar.edu.unlp.oo1.ejercicio7;

import java.util.ArrayList;
import java.util.List;

public class Farola {
  /*
   * Crear una farola. Debe inicializarla como apagada
   */
  private List<Farola> neighbors;
  private boolean state;

  public Farola() {
    neighbors = new ArrayList<Farola>();
    state = false;
  };

  /*
   * Crea la relación de vecinos entre las farolas. La relación de vecinos entre
   * las farolas es recíproca, es decir el receptor del mensaje será vecino de
   * otraFarola, al igual que otraFarola también se convertirá en vecina del
   * receptor del mensaje
   */
  public void pairWithNeighbor(Farola otraFarola) {
    neighbors.add(otraFarola);
    if (!otraFarola.getNeighbors().contains(this)) {
      otraFarola.pairWithNeighbor(this);
    }
  }

  /*
   * Retorna sus farolas vecinas
   */
  public List<Farola> getNeighbors() {
    return neighbors;
  }

  /*
   * Si la farola no está encendida, la enciende y propaga la acción.
   */
  public void turnOn() {
    if (!state) {
      state = true;
      neighbors.stream().forEach(f -> f.turnOn());
    }
  }

  /*
   * Si la farola no está apagada, la apaga y propaga la acción.
   */
  public void turnOff() {
    if (state) {
      state = false;
      neighbors.stream().forEach(f -> f.turnOff());
    }
  }

  /*
   * Retorna true si la farola está encendida.
   */
  public boolean isOn() {
    return state;
  }

  public boolean isOff() {
    return !state;
  }
}

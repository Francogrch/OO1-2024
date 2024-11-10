package ar.edu.unlp.oo1.ejercicio24;

import java.util.List;
import java.util.ArrayList;

public class Pasajero extends Usuario {
  private List<Viaje> viajes;

  public Pasajero(String nombre, double saldo) {
    super(nombre, saldo);
    viajes = new ArrayList<Viaje>();
  }

  public boolean agregarViaje(Viaje viaje) {
    if (viaje.hayLugar() && (viaje.hace2()) && (viaje.costoViaje(1) <= this.getSaldo())) {
      viajes.add(viaje);
      return viaje.agregarPasajero(this);
    } else {
      return false;
    }
  }

  public double aCobrar(double monto) {
    double descuento = 0;
    if (!viajes.isEmpty()) {
      descuento = 500;
    }
    return monto - descuento;
  }

  public double aIngresar(double monto) {
    double montoNuevo = monto;
    if (!viajes.stream().anyMatch(v -> v.hace30())) {
      montoNuevo -= montoNuevo * 0.10;
    }
    return montoNuevo;
  }

}

package ar.edu.unlp.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Viaje {
  private String origen, destino;
  private double costo;
  private LocalDate fecha;
  private Vehiculo vehiculo;
  private List<Usuario> pasajeros;

  public Viaje(String origen, String destino, double costo, LocalDate fecha, Vehiculo vehiculo) {
    this.origen = origen;
    this.destino = destino;
    this.costo = costo;
    this.fecha = fecha;
    this.vehiculo = vehiculo;
    pasajeros = new ArrayList<>();
    agregarPasajero(vehiculo.getDuenio());
  }

  public boolean agregarPasajero(Usuario user) {
    return pasajeros.add(user);
  }

  public boolean hayLugar() {
    return (vehiculo.getCapacidad() < pasajeros.size());
  }

  public void procesar() {
    double nuevoCosto = costoViaje();
    pasajeros.stream().forEach(p -> p.pagar(nuevoCosto));
  }

  public double costoViaje() {
    return costo / pasajeros.size();
  }

  public double costoViaje(int cant) {
    return costo / (pasajeros.size() + cant);
  }

  public boolean hace30() {
    return (fecha.isAfter(LocalDate.now().minusDays(30)));
  }

  public boolean hace2() {
    return (fecha.isAfter(LocalDate.now().minusDays(2)));
  }

}

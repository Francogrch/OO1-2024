package ar.edu.unlp.oo1.ejercicio17;

import java.util.List;

import ar.edu.unlp.oo1.ejercicio14b.DateLapse;

import java.util.ArrayList;

public class Propiedad {
  private String direccion, nombre;
  private double precioNoche;
  private List<Reserva> reservas;

  public Propiedad(String nombre, String direccion, double precioNoche) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.precioNoche = precioNoche;
    this.reservas = new ArrayList<Reserva>();

  }

  public boolean disponible(DateLapse periodo) {
    return !reservas.stream().anyMatch(r -> r.overlap(periodo));
  }

  public boolean crearReserva(DateLapse periodo) {
    if (disponible(periodo)) {
      return reservas.add((new Reserva(periodo, this)));
    }
    return false;
  }

  public double calcularIngreso(DateLapse periodo) {
    return reservas.stream()
        .filter(r -> periodo.includesDate(r.getPeriodo().getFrom()) && periodo.includesDate(r.getPeriodo().getTo()))
        .mapToDouble(r -> r.calcularPrecio()).sum();
  }

  public boolean cancelar(Reserva reserva) {
    return reservas.remove(reserva);
  }

  public String getDireccion() {
    return direccion;
  }

  public String getNombre() {
    return nombre;
  }

  public double getPrecioNoche() {
    return precioNoche;
  }

}

package ar.edu.unlp.oo1.ejercicio18;

import java.util.List;

import ar.edu.unlp.oo1.ejercicio14b.DateLapse;

import java.util.ArrayList;
import java.time.LocalDate;

public class Propiedad {
  private String direccion, nombre;
  private double precioNoche;
  private List<Reserva> reservas;
  private PoliticaReserva politica;

  public Propiedad(String nombre, String direccion, double precioNoche, PoliticaReserva politica) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.precioNoche = precioNoche;
    this.reservas = new ArrayList<Reserva>();
    this.politica = politica;
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

  public double cancelar(Reserva reserva) {
    if (reserva.getPeriodo().getTo().isBefore(LocalDate.now())) {
      reservas.remove(reserva);
      return politica.valorReembolso(reserva.calcularPrecio(), reserva.getPeriodo().getFrom());
    }
    return 0;
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

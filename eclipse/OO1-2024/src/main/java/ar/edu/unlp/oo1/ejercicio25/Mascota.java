package ar.edu.unlp.oo1.ejercicio25;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Mascota {
  private String nombre, especie;
  private LocalDate fecha;
  private List<Servicio> servicios;

  public Mascota(String nombre, String especie, LocalDate fecha) {
    this.nombre = nombre;
    this.especie = especie;
    this.fecha = fecha;
    servicios = new ArrayList<>();
  }

  public ConsultaMedica darAltaConsulta(Veterinario medico) {
    ConsultaMedica consulta = new ConsultaMedica(LocalDate.now(), this, medico);
    servicios.add(consulta);
    return consulta;
  }

  public Vacunacion darAltaVacunacion(Veterinario medico, String nombre, double costo) {
    Vacunacion vacunacion = new Vacunacion(LocalDate.now(), this, medico, nombre, costo);
    servicios.add(vacunacion);
    return vacunacion;
  }

  public ServicioGuarderia darAltaGuarderia(int cant) {
    ServicioGuarderia servicio = new ServicioGuarderia(LocalDate.now(), this, cant);
    servicios.add(servicio);
    return servicio;
  }

  public boolean utilizoMasDe5() {
    return (servicios.size() >= 5);
  }

  public double recaudacion(LocalDate fecha) {
    return servicios.stream().filter(s -> s.mismaFecha(fecha)).mapToDouble(s -> s.costo()).sum();
  }

}

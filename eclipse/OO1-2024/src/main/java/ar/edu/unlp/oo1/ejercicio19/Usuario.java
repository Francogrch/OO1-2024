package ar.edu.unlp.oo1.ejercicio19;

import java.util.List;
import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Usuario {

  private String nombre, direccion;
  private List<Envio> envios;

  public Usuario(String nombre, String direccion) {
    this.nombre = nombre;
    this.direccion = direccion;
    envios = new ArrayList<Envio>();
  }

  public double montoAPagar(LocalDate from, LocalDate to) {
    return envios.stream().filter(e -> e.overlap(from, to)).mapToDouble(e -> e.monto()).sum();
  };
}

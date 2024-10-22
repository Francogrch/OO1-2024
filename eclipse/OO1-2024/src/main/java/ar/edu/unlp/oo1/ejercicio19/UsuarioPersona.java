package ar.edu.unlp.oo1.ejercicio19;

import java.time.LocalDate;

public class UsuarioPersona extends Usuario {
  private String dni;

  public UsuarioPersona(String nombre, String direccion, String dni) {
    super(nombre, direccion);
    this.dni = dni;
  }

  @Override
  public double montoAPagar(LocalDate from, LocalDate to) {
    return super.montoAPagar(from, to) * 0.90;
  }
}

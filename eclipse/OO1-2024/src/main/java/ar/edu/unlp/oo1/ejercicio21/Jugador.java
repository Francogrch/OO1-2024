package ar.edu.unlp.oo1.ejercicio21;

public class Jugador {
  private String nombre, apellido;

  public Jugador(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public boolean equals(Jugador other) {
    return (other.getNombre().equals(nombre) && other.getApellido().equals(apellido));
  }

}

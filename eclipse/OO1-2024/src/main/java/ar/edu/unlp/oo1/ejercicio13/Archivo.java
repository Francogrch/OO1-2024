
package ar.edu.unlp.oo1.ejercicio13;

public class Archivo {
  private String nombre;

  public Archivo(String nombre) {
    this.nombre = nombre;
  }

  public Integer tamanio() {
    return nombre.length();
  }
}

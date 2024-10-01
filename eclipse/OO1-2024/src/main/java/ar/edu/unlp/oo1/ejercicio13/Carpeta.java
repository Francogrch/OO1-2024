package ar.edu.unlp.oo1.ejercicio13;

import java.util.List;
import java.util.ArrayList;

public class Carpeta {
  private String nombre;
  private List<Email> emails;

  public Carpeta(String nombre) {
    emails = new ArrayList<Email>();
    this.nombre = nombre;
  }

  public String getNombre() {
    return nombre;
  }

  public void agregarEmail(Email email) {
    emails.add(email);
  }

  public void mover(Email email, Carpeta destino) {
    emails.remove(email);
    destino.agregarEmail(email);
  }

  public Email buscarEmail(String texto) {
    return emails.stream().filter(e -> e.tieneTexto(texto)).findFirst().orElse(null);
  }

  public Integer tamanio() {
    return emails.stream().mapToInt(e -> e.tamanio()).sum();
  }
}

package ar.edu.unlp.oo1.ejercicio22;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

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

  public List<Email> getEmails() {
    return emails;
  }

  public Map<String, Integer> tamanioCategoria() {
    Map<String, Integer> map = new HashMap<String, Integer>();
    map.put("pequenio", 0);
    map.put("mediano", 0);
    map.put("grande", 0);
    emails.stream().forEach(e -> map.put(e.categoriaTamanio(), map.get(e.categoriaTamanio()) + 1));
    return map;
  }
}

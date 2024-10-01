package ar.edu.unlp.oo1.ejercicio13;

import java.util.List;
import java.util.ArrayList;

public class Email {

  private String titulo;
  private String cuerpo;
  private List<Archivo> adjuntos;

  public Email() {
  }

  public Email(String titulo, String cuerpo) {
    adjuntos = new ArrayList<Archivo>();
    this.titulo = titulo;
    this.cuerpo = cuerpo;
  }

  public void agregarArchivo(Archivo archivo) {
    adjuntos.add(archivo);
  }

  public String getTitulo() {
    return titulo;
  }

  public String getCuerpo() {
    return cuerpo;
  }

  public boolean tieneTexto(String texto) {
    return (titulo.contains(texto) | cuerpo.contains(texto));

  }

  public Integer tamanio() {
    return adjuntos.stream().mapToInt(a -> a.tamanio()).sum();
  }
}

package ar.edu.unlp.oo1.ejercicio22;

import ar.edu.unlp.oo1.ejercicio13.Archivo;

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

  public String categoriaTamanio() {
    int tamanio = tamanio();
    String retu;
    if (tamanio <= 300) {
      retu = "pequenio";
    } else if (tamanio <= 500) {
      retu = "mediano";
    } else {
      retu = "grande";
    }
    return retu;
  }
}

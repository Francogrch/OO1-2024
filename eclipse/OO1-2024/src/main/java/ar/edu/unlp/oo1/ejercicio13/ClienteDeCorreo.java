package ar.edu.unlp.oo1.ejercicio13;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class ClienteDeCorreo {
  private List<Carpeta> carpetas;
  private Carpeta inbox;

  public ClienteDeCorreo() {
    carpetas = new ArrayList<Carpeta>();
    inbox = new Carpeta("Inbox");
  }

  public void recibir(Email email) {
    inbox.agregarEmail(email);
  }

  public Email buscar(String texto) {
    boolean encontre = false;
    Iterator<Carpeta> it = carpetas.iterator();
    Email e = new Email();
    while (!encontre) {
      e = it.next().buscarEmail(texto);
      if (e != null) {
        encontre = true;
      }
    }
    return e;
  }

  public Integer espacioOcuapdo() {
    return (inbox.tamanio() + carpetas.stream().mapToInt(c -> c.tamanio()).sum());
  }

}

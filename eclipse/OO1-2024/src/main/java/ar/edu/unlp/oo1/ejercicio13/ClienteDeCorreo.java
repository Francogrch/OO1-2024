package ar.edu.unlp.oo1.ejercicio13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

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
    Email retu = inbox.buscarEmail(texto);
    return (retu != null) ? retu
        : carpetas.stream().map(c -> c.buscarEmail(texto)).filter(e -> e != null)
            .collect(Collectors.toList()).get(1);
  }

  public void agregarCarpeta(Carpeta carpeta) {
    carpetas.add(carpeta);
  }

  public Integer espacioOcuapdo() {
    return (inbox.tamanio() + carpetas.stream().mapToInt(c -> c.tamanio()).sum());
  }

  public List<Carpeta> getCarpetas() {
    return carpetas;
  }

  public Carpeta getInbox() {
    return inbox;
  }

}

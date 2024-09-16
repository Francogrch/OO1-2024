package ar.edu.unlp.oo1.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
  private List<Producto> productos;

  public Balanza() {
    productos = new ArrayList<>();
  }

  public void ponerEnCero() {
    productos.clear();
  }

  public void agregarProducto(Producto p) {
    productos.add(p);
  }

  public Ticket emitirTicket() {
    return new Ticket(productos);
  }

  public int getCantidadDeProductos() {
    return productos.size();
  }

  public double getPrecioTotal() {
    return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
  }

  public double getPesoTotal() {
    return productos.stream().mapToDouble(p -> p.getPeso()).sum();
  }

  public List<Producto> getProductos() {
    return productos;
  }

  public void setProductos(List<Producto> productos) {
    this.productos = productos;
  }
}

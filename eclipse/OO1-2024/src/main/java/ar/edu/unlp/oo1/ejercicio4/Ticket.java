package ar.edu.unlp.oo1.ejercicio4;

import java.time.LocalDate;
import java.util.List;

public class Ticket {
  private LocalDate fecha;
  private List<Producto> productos;

  public Ticket() {
  }

  // Nuevo
  public Ticket(List<Producto> productos) {
    this.productos = productos;
    fecha = LocalDate.now();
  }

  public LocalDate getFecha() {
    return fecha;
  }

  public void setFecha(LocalDate fecha) {
    this.fecha = fecha;
  }

  public List<Producto> getProductos() {
    return productos;
  }

  public void setProductos(List<Producto> productos) {
    this.productos = productos;
  }

  public double getPesoTotal() {
    return productos.stream().mapToDouble(p -> p.getPeso()).sum();
  }

  public double getPrecioTotal() {
    return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
  }

  public double impuesto() {
    return getPrecioTotal() * 0.21;
  }

}

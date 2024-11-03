package ar.edu.unlp.oo1.ejercicio23;

public class Producto {
  private String nombre, categoria;
  private double precio;
  private int cant;

  public Producto(String nombre, String categoria, double precio, int cant) {
    this.nombre = nombre;
    this.categoria = categoria;
    this.precio = precio;
    this.cant = cant;
  }

  public boolean hayStock(int cant) {
    return this.cant >= cant;
  }

  public void stockSuficiente(int cant) {
    if (hayStock(cant)) {
      this.cant = this.cant - cant;
    }
  }

  public boolean mismaCategoria(String otraCategoria) {
    return categoria.equals(otraCategoria);
  }

  public double getPrecio() {
    return precio;
  }
}

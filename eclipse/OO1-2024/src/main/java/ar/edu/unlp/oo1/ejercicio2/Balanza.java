package ar.edu.unlp.oo1.ejercicio2;

public class Balanza {
  private double precioTotal;
  private double pesoTotal;
  private int cantidadDeProductos;

  public Balanza() {
    cantidadDeProductos = 0;
    precioTotal = 0;
    pesoTotal = 0;
  }

  public void ponerEnCero() {
    precioTotal = 0;
    pesoTotal = 0;
    cantidadDeProductos = 0;
  }

  public void agregarProducto(Producto p) {
    precioTotal += p.getPrecio();
    pesoTotal += p.getPeso();
    cantidadDeProductos += 1;
  }

  public Ticket emitirTicket() {
    return new Ticket(this.getCantidadDeProductos(), pesoTotal, precioTotal);
  }

  public int getCantidadDeProductos() {
    return cantidadDeProductos;
  }

  public double getPrecioTotal() {
    return precioTotal;
  }

  public void setPrecioTotal(double precioTotal) {
    this.precioTotal = precioTotal;
  }

  public double getPesoTotal() {
    return pesoTotal;
  }

  public void setPesoTotal(double pesoTotal) {
    this.pesoTotal = pesoTotal;
  }

}

package ar.edu.unlp.oo1.ejercicio23;

public class Pedido {
  private int cant;
  private Envio envio;
  private Pago pago;
  private Producto producto;

  public Pedido() {
  }

  public Pedido(int cant, Envio envio, Pago pago, Producto producto) {
    this.cant = cant;
    this.envio = envio;
    this.pago = pago;
    this.producto = producto;
  }

  public double costoTotal() {
    return (pago.precio((cant * producto.getPrecio())) + envio.costo());
  }

  public int compararCategoria(String categoria) {
    return producto.mismaCategoria(categoria) ? cant : 0;
  }
}

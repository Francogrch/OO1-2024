package ar.edu.unlp.oo1.ejercicio23;

public class Pedido {
  private int cant;
  private Envio envio;
  private Pago pago;
  private Producto producto;
  private Vendedor vendedor;
  private Cliente cliente;

  public Pedido(int cant, Envio envio, Pago pago, Producto producto, Vendedor vendedor, Cliente cliente) {
    this.cant = cant;
    this.envio = envio;
    this.pago = pago;
    this.producto = producto;
    this.vendedor = vendedor;
    this.cliente = cliente;
  }

  public double costoTotal() {
    return (pago.precio((cant * producto.getPrecio())) + envio.costo(vendedor.getDomicilio(), cliente.getDomicilio()));
  }
}

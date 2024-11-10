package ar.edu.unlp.oo1.ejercicio23;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
  private String nombre, direccion;
  private List<Pedido> pedidos;
  private List<Producto> productos;

  public Usuario(String nombre, String direccion) {
    this.nombre = nombre;
    this.direccion = direccion;
    pedidos = new ArrayList<Pedido>();
    productos = new ArrayList<Producto>();
  }

  public Pedido crearPedido(int cant, Envio formaEnvio, Pago formaPago, Producto producto) {
    Pedido pedido = new Pedido();
    if (producto.stockSuficiente(cant)) {
      pedido = new Pedido(cant, formaEnvio, formaPago, producto);
      pedidos.add(pedido);
    }
    return pedido;
  }

  public int cantCategoria(String categoria) {
    return pedidos.stream().mapToInt(p -> p.compararCategoria(categoria)).sum();

  }

  public boolean agregarProducto(Producto producto) {
    return productos.add(producto);
  }

  public String getNombre() {
    return nombre;
  }

  public String getDireccion() {
    return direccion;
  }

  public List<Pedido> getPedidos() {
    return pedidos;
  }

}

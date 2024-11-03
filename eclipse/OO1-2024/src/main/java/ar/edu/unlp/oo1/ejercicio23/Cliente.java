package ar.edu.unlp.oo1.ejercicio23;

import java.util.List;
import java.util.ArrayList;

public class Cliente extends Persona {
  private List<Pedido> pedidos;

  public Cliente(String nombre, String direccion) {
    super(nombre, direccion);
    pedidos = new ArrayList<Pedido>();
  }

public Pedido crearPedido(Pago formaPago,Envio formaEnvio,Producto producto,int cant){

  if (producto.stockSuficiente(cant)){
    return new Pedido(cant, formaEnvio,formaPago,producto,,this)
  }

}

}

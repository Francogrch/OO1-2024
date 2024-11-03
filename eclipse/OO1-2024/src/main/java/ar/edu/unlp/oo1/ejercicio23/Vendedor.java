package ar.edu.unlp.oo1.ejercicio23;

import java.util.List;
import java.util.ArrayList;

public class Vendedor extends Persona {
  private List<Producto> productos;

  public Vendedor(String nombre, String direccion) {
    super(nombre, direccion);
    productos = new ArrayList<Producto>();
  }

  public boolean agregarProducto(Producto producto) {
    return productos.add(producto);
  }

}

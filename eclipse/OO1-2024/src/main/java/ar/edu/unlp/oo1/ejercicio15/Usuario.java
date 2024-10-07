package ar.edu.unlp.oo1.ejercicio15;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
  private String nombre;
  private String domicilio;
  private List<Consumo> consumos;

  public Usuario(String nombre, String domicilio) {
    this.nombre = nombre;
    this.domicilio = domicilio;
    consumos = new ArrayList<Consumo>();
  }

  public void agregarConsumo(Consumo consumo) {
    consumos.add(consumo);
  }

  public Factura generarFactura() {
    return new Factura(this, consumos.get(0));
  }

}

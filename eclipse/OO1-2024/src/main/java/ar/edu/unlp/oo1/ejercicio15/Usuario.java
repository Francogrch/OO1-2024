package ar.edu.unlp.oo1.ejercicio15;

import java.util.List;
import java.util.ArrayList;

public class Usuario {
  private String nombre;
  private String domicilio;
  private List<Consumo> consumos;
  private List<Factura> facturas;

  public Usuario(String nombre, String domicilio) {
    this.nombre = nombre;
    this.domicilio = domicilio;
    consumos = new ArrayList<Consumo>();
    facturas = new ArrayList<Factura>();
  }

  public void agregarConsumo(Consumo consumo) {
    consumos.add(consumo);
  }

  public Factura generarFactura() {
    Factura nueva = new Factura(this, consumos.get((consumos.size() - 1)));
    if (!facturas.contains(nueva)) {
      facturas.add(nueva);
    }
    return nueva;
  }

  public List<Factura> getFacturas() {
    return facturas;
  }
}

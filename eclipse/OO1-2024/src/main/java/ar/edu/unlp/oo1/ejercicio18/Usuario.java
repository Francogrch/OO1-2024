package ar.edu.unlp.oo1.ejercicio18;

import ar.edu.unlp.oo1.ejercicio14b.DateLapse;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
  private String nombre, direccion;
  private int dni;
  private List<Propiedad> propiedades;

  public Usuario(String nombre, String direccion, int dni) {
    this.nombre = nombre;
    this.direccion = direccion;
    this.dni = dni;
    propiedades = new ArrayList<Propiedad>();
  }

  public double calcularIngreso(DateLapse periodo) {
    return propiedades.stream().mapToDouble(p -> p.calcularIngreso(periodo)).sum();
  }

  public boolean agregarPropiedad(Propiedad propiedad) {
    return propiedades.add(propiedad);
  }
}

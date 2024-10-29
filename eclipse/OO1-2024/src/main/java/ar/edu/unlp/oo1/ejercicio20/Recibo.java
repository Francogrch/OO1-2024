package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;

public class Recibo {
  private String nombre, apellido;
  private int cuil, antiguedad;
  private LocalDate fecha;
  private double montoAcobrar;

  public Recibo(String nombre, String apellido, int cuil, int antiguedad, double montoAcobrar) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.cuil = cuil;
    this.antiguedad = antiguedad;
    this.fecha = LocalDate.now();
    this.montoAcobrar = montoAcobrar;
  }

}

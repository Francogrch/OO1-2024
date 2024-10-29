package ar.edu.unlp.oo1.ejercicio20;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Empleado {
  private String nombre, apellido;
  private int cuil, hijos, conyuge;
  private LocalDate fechaNac;

  private List<Recibo> recibos;
  private List<Contrato> contratos;

  public Empleado(String nombre, String apellido, int cuil, int hijos, int conyuge, LocalDate fechaNac) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.cuil = cuil;
    this.hijos = hijos;
    this.conyuge = conyuge;
    this.fechaNac = fechaNac;
    recibos = new ArrayList<>();
    contratos = new ArrayList<>();
  }

  public Recibo generarRecibo() {
    Contrato activo = getActivo();
    if (activo != null) {
      double montoACobrar = getActivo().monto();
      Recibo recibo = new Recibo(nombre, apellido, cuil, getAntiguedad(), montoACobrar);
      recibos.add(recibo);
      return recibo;
    }
    return null;
  }

  public boolean agregarContrato(Contrato contrato) {
    return contratos.add(contrato);
  }

  public int getAntiguedad() {
    int meses = contratos.stream().mapToInt(c -> c.mesesTrabajados()).sum();
    return (int) (meses / 12);
  }

  private Contrato getActivo() {
    return contratos.stream().filter(c -> c.esVigente()).findFirst().orElse(null);
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public int getCuil() {
    return cuil;
  }

  public int getHijos() {
    return hijos;
  }

  public int getConyuge() {
    return conyuge;
  }

}

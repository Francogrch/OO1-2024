package ar.edu.unlp.oo1.ejercicio19;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {
  private String pais;

  public EnvioInternacional(LocalDate fecha, String origen, String destino, double peso, String pais) {
    super(fecha, origen, destino, peso);
    this.pais = pais;
  }

  public double monto() {
    if (this.getPeso() <= 1) {
      return 10 * this.getPeso();
    } else {
      return 12 * this.getPeso();
    }
  }
}

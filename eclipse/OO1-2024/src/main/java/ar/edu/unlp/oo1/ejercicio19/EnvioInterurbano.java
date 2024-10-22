package ar.edu.unlp.oo1.ejercicio19;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
  private int km;

  public EnvioInterurbano(LocalDate fecha, String origen, String destino, double peso, int km) {
    super(fecha, origen, destino, peso);
    this.km = km;
  }

  public double monto() {
    if (km < 100) {
      return (20 * this.getPeso());
    } else if (km > 100 && km < 500) {
      return (25 * this.getPeso());
    } else {
      return (30 * this.getPeso());
    }
  }

}

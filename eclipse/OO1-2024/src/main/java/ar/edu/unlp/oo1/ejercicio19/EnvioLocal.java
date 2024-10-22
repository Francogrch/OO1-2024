package ar.edu.unlp.oo1.ejercicio19;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
  private boolean entregaRapida;

  public EnvioLocal(LocalDate fecha, String origen, String destino, double peso, boolean entregaRapida) {
    super(fecha, origen, destino, peso);
    this.entregaRapida = entregaRapida;
  }

  public double monto() {
    return entregaRapida ? 1500 : 1000;
  }
}

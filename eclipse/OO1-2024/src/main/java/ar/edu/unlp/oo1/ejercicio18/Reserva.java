package ar.edu.unlp.oo1.ejercicio18;

import ar.edu.unlp.oo1.ejercicio14b.DateLapse;

public class Reserva {
  private DateLapse periodo;
  private Propiedad propiedad;

  public Reserva(DateLapse periodo, Propiedad propiedad) {
    this.periodo = periodo;
    this.propiedad = propiedad;
  }

  public double calcularPrecio() {
    return (periodo.sizeInDays() * propiedad.getPrecioNoche());
  }

  private int cantDias(DateLapse periodo2) {
    int noches = 0;
    if (periodo.includesDate(periodo2.getFrom())) {
      noches = (new DateLapse(periodo2.getFrom(), periodo.getTo()).sizeInDays());
      return (periodo2.sizeInDays() > noches) ? noches : periodo2.sizeInDays();
    }
    return noches;
  }

  public double calcularPrecio(DateLapse periodo2) {
    return cantDias(periodo2) * propiedad.getPrecioNoche();
  }

  public boolean overlap(DateLapse periodo2) {
    return periodo.includesDate(periodo2.getTo()) && this.periodo.includesDate(periodo2.getFrom());
  }

  public double cancelar() {
    return propiedad.cancelar(this);
  }

  public DateLapse getPeriodo() {
    return periodo;
  }
}

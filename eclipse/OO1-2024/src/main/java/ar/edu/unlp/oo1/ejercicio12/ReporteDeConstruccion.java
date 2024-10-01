package ar.edu.unlp.oo1.ejercicio12;

import java.util.List;
import java.util.ArrayList;

public class ReporteDeConstruccion {
  private List<Pieza> piezas;

  public ReporteDeConstruccion() {
    piezas = new ArrayList<Pieza>();
  }

  public void addPieza(Pieza pieza) {
    piezas.add(pieza);
  }

  public double getVolumenDeMaterial(String material) {

    return piezas.stream().filter(p -> p.getMaterial().equals(material)).mapToDouble(p -> p.getVolumen()).sum();

  }

  public double getSuperficieDeColor(String color) {

    return piezas.stream().filter(p -> p.getColor().equals(color)).mapToDouble(p -> p.getSuperficie()).sum();
  }
}

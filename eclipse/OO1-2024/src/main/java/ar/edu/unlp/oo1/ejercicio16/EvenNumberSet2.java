package ar.edu.unlp.oo1.ejercicio16;

import java.util.LinkedHashSet;

public class EvenNumberSet2 extends LinkedHashSet<Integer> {

  public EvenNumberSet2() {
  }

  @Override
  public boolean add(Integer n) {
    if (n % 2 == 0) {
      return super.add(n);
    }
    return false;
  }
}

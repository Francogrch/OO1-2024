package ar.edu.unlp.oo1.ejercicio16;

import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class EvenNumberSet implements Set<Integer> {
  private List<Integer> lista;

  public EvenNumberSet() {
    lista = new ArrayList<Integer>();
  }

  @Override
  public boolean add(Integer n) {
    if ((n % 2 == 0) && (!lista.contains(n))) {
      lista.add(n);
      return true;
    }
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends Integer> c) {
    return lista.addAll(c);
  }

  @Override
  public void clear() {
    lista.clear();
  }

  @Override
  public boolean contains(Object o) {
    return lista.contains(o);
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return lista.containsAll(c);
  }

  @Override
  public boolean equals(Object o) {
    return lista.equals(o);
  }

  @Override
  public int hashCode() {
    return lista.hashCode();
  }

  @Override
  public boolean isEmpty() {
    return lista.isEmpty();
  }

  @Override
  public Iterator<Integer> iterator() {
    return lista.iterator();
  }

  @Override
  public boolean remove(Object n) {
    return lista.remove(n);
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return lista.removeAll(c);
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return lista.retainAll(c);
  }

  @Override
  public int size() {
    return lista.size();
  }

  @Override
  public Object[] toArray() {
    return lista.toArray();
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return lista.toArray(a);
  }

}

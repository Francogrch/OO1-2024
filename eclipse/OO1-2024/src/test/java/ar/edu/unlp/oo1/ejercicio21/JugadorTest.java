package ar.edu.unlp.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Map;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JugadorTest {
  private Map<Jugador, Integer> dic;
  private Jugador messi, aguero, batistuta;

  @BeforeEach
  void setUp() throws Exception {
    dic = new HashMap<Jugador, Integer>();
    messi = new Jugador("Lionel", "Messi");
    aguero = new Jugador("Kun", "Aguero");
    batistuta = new Jugador("Gabriel", "Batistuta");
    dic.put(messi, 111);
    dic.put(aguero, 56);
    dic.put(batistuta, 42);
  }

  @Test
  void puntoB() {
    assertTrue(dic.containsKey(aguero));
    assertEquals(dic.remove(aguero), 56);
    assertFalse(dic.containsKey(aguero));
  }

  @Test
  void puntoC() {
    dic.put(messi, 112);
    assertEquals(dic.get(messi), 112);
  }

  @Test
  void puntoD() {
    dic.put(batistuta, 100);
    assertEquals(dic.get(batistuta), 100);
    // No se puede agregar dos claves iguales, la nueva pisa a la anterior

  }

  @Test
  void puntoE() {
    assertEquals(dic.values().stream().mapToInt(i -> i).sum(), 209);
  }
}

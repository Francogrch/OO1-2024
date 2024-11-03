package ar.edu.unlp.oo1.ejercicio21;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import java.util.Map;
import java.util.HashMap;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MapTest {
  private Map<String, Integer> dic;

  @BeforeEach
  void setUp() throws Exception {
    dic = new HashMap<String, Integer>();
    dic.put("Lionel Messi", 111);
    dic.put("Gabriel Batistuta", 56);
    dic.put("Kun Aguero", 42);
  }

  @Test
  void puntoB() {
    assertTrue(dic.containsKey("Kun Aguero"));
    assertEquals(dic.remove("Kun Aguero"), 42);
    assertFalse(dic.containsKey("Kun Aguero"));
  }

  @Test
  void puntoC() {
    dic.put("Lionel Messi", 112);
    assertEquals(dic.get("Lionel Messi"), 112);
  }

  @Test
  void puntoD() {
    dic.put("Gabriel Batistuta", 100);
    assertEquals(dic.get("Gabriel Batistuta"), 100);
    // No se puede agregar dos claves iguales, la nueva pisa a la anterior

  }

  @Test
  void puntoE() {
    assertEquals(dic.values().stream().mapToInt(i -> i).sum(), 209);
  }
}

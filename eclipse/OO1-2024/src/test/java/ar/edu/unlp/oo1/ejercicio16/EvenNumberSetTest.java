package ar.edu.unlp.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EvenNumberSetTest {
  private EvenNumberSet set;

  @BeforeEach
  void setUp() throws Exception {
    set = new EvenNumberSet();
  }

  @Test
  void addTest() {
    set.add(1);
    assertFalse(set.contains(1));
    set.add(2);
    assertTrue(set.contains(2));
  }

  @Test
  void sizeTest() {
    assertEquals(set.size(), 0);
    set.add(1);
    assertEquals(set.size(), 0);
    set.add(2);
    assertEquals(set.size(), 1);
  }
}

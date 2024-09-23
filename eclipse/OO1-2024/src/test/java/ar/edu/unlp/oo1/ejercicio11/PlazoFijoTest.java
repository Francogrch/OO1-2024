package ar.edu.unlp.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class PlazoFijoTest {
  private PlazoFijo p1;
  private PlazoFijo p2;

  @BeforeEach
  void setUp() throws Exception {
    p1 = new PlazoFijo(LocalDate.of(1990, 12, 22), 200, 0.20);
    p2 = new PlazoFijo(LocalDate.of(2000, 12, 22), 200, 0.30);
  }

  @Test
  void valorActualTest() {
    assertEquals(p1.valorActual(), 240);
    assertEquals(p2.valorActual(), 260);
  }
}

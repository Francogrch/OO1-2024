package ar.edu.unlp.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PrismaRectangularTest {
  private PrismaRectangular p1;
  private PrismaRectangular p2;

  @BeforeEach
  void setUp() throws Exception {
    p1 = new PrismaRectangular(6, 4, 8, "Plomo", "Azul");
    p2 = new PrismaRectangular(5, 3, 9, "Hierro", "Verde");
  }

  @Test
  void getSuperficieTest() {
    assertEquals(p1.getSuperficie(), 208);
    assertEquals(p2.getSuperficie(), 174);
  }

  @Test
  void getVolumenTest() {
    assertEquals(p1.getVolumen(), 192);
    assertEquals(p2.getVolumen(), 135);
  }
}

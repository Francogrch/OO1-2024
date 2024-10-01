package ar.edu.unlp.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CilindroTest {
  private Cilindro cilindro1;
  private Cilindro cilindro2;

  @BeforeEach
  void setUp() throws Exception {
    cilindro1 = new Cilindro(3, 5, "hierro", "blanco");
    cilindro2 = new Cilindro(7, 10, "plomo", "gris");

  }

  @Test
  void getSuperficieTest() {
    assertEquals(cilindro1.getSuperficie(), 151);
    assertEquals(cilindro2.getSuperficie(), 748);
  }

  @Test
  void getVolumenTest() {
    assertEquals(cilindro1.getVolumen(), 141);
    assertEquals(cilindro2.getVolumen(), 1539);
  }

}

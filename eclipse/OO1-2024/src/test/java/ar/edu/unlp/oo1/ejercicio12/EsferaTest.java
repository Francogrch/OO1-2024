package ar.edu.unlp.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EsferaTest {
  private Esfera e1;
  private Esfera e2;

  @BeforeEach
  void setUp() throws Exception {
    e1 = new Esfera(4, "Plomo", "Azul");
    e2 = new Esfera(6, "Hierro", "Blanco");
  }

  @Test
  void getSuperficieTest() {
    assertEquals(e1.getSuperficie(), 201);
    assertEquals(e2.getSuperficie(), 452);
  }

  @Test
  void getVolumenTest() {
    assertEquals(e1.getVolumen(), 268);
    assertEquals(e2.getVolumen(), 905);
  }

}

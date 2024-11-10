package ar.edu.unlp.oo1.ejercicio23;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PagoTest {

  private Pago cuotas6;
  private Pago alContado;

  @BeforeEach
  void setUp() throws Exception {
    cuotas6 = new Cuotas6();
    alContado = new AlContado();

  }

  @Test
  void costoTest() {
    assertEquals(cuotas6.precio(100), 120);
    assertEquals(alContado.precio(100), 100);
  }
}

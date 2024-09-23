
package ar.edu.unlp.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {

  private CajaDeAhorro ca1;
  private CajaDeAhorro ca2;

  @BeforeEach
  void setUp() throws Exception {
    this.ca1 = new CajaDeAhorro();
    this.ca2 = new CajaDeAhorro();
  }

  @Test
  void extraerTest() {
    ca1.depositar(2000);
    assertTrue(ca1.extraer(200));
    assertFalse(ca1.extraer(1900));
    assertFalse(ca1.extraer(1800));
  }

  @Test
  void transferirACuentaTest() {
    ca1.depositar(2000);
    ca1.transferirACuenta(1000, ca2);
    assertEquals(ca1.getSaldo(), 980);
  }
}

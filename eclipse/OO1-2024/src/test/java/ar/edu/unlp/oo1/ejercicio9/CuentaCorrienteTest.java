package ar.edu.unlp.oo1.ejercicio9;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
  private CuentaCorriente cc1;
  private CuentaCorriente cc2;

  @BeforeEach
  void setUp() throws Exception {
    cc1 = new CuentaCorriente();
    cc2 = new CuentaCorriente();
    cc1.setDescubrimiento(2000);
  }

  @Test
  void extraer() {
    cc1.depositar(1000);
    assertTrue(cc1.extraer(1200));
    assertFalse(cc1.extraer(1200));
  }

  @Test
  void transferirACuenta() {
    assertTrue(cc1.transferirACuenta(1200, cc2));
    assertFalse(cc1.transferirACuenta(900, cc2));
  }
}

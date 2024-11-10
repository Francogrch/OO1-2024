package ar.edu.unlp.oo1.ejercicio23;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EnvioTest {
  private Envio retirarComercio;
  private Envio retirarSucursal;
  private Envio expressDomicilio;

  @BeforeEach
  void setUp() {
    retirarComercio = new RetirarComercio();
    retirarSucursal = new RetirarSucursal();
    expressDomicilio = new ExpressDomicilio("Calle 12 120", "Calle 13 230");
  }

  @Test
  void costo() {
    assertEquals(retirarComercio.costo(), 0);
    assertEquals(retirarSucursal.costo(), 3000);
    assertEquals(expressDomicilio.costo(), 100);
  }
}

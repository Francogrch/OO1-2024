package ar.edu.unlp.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.LocalDate;

public class FacturaTest {
  private Factura facturaConBoni;
  private Factura facturaSinBoni;
  private Factura cambioDeTarifa;
  private Usuario u1;

  @BeforeEach
  void setUp() throws Exception {
    CuadroTarifario.setTarifa(10);
    u1 = new Usuario("Juan Perez", "Calle 12 1200");
    facturaConBoni = new Factura(u1, new Consumo(1000, 200, LocalDate.now()));
    facturaSinBoni = new Factura(u1, new Consumo(1000, 800, LocalDate.now()));
  }

  @Test
  void testMontoFinal() {
    assertEquals(facturaConBoni.getMontoFinal(), 9000);
    assertEquals(facturaSinBoni.getMontoFinal(), 10000);
    CuadroTarifario.setTarifa(15);
    cambioDeTarifa = new Factura(u1, new Consumo(500, 100, LocalDate.now()));
    assertEquals(cambioDeTarifa.getMontoFinal(), 6750);
  }

  @Test
  void testBonificacion() {
    assertEquals(facturaConBoni.getBonificacion(), 0.9);
    assertEquals(facturaSinBoni.getBonificacion(), 1);
    CuadroTarifario.setTarifa(15);
    cambioDeTarifa = new Factura(u1, new Consumo(500, 100, LocalDate.now()));
    assertEquals(cambioDeTarifa.getBonificacion(), 0.9);
  }
}

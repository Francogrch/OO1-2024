package ar.edu.unlp.oo1.ejercicio15;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.LocalDate;

public class UsuarioTest {

  private Usuario usuarioSinConsumos;
  private Usuario usuarioConConsumo;
  private Usuario usuarioConMuchosConsumo;

  @BeforeEach
  void setUp() throws Exception {
    CuadroTarifario.setTarifa(10);
    usuarioConConsumo = new Usuario("Carlos Gonzalez", "Ca. 56 1330");
    usuarioSinConsumos = new Usuario("Betty Gonzalez", "Ca. 57 1330");

    usuarioConMuchosConsumo = new Usuario("EDELAP S.A", "Ca. 6 987");
    Consumo consumo1 = new Consumo(1000, 200, LocalDate.now());
    usuarioConConsumo.agregarConsumo(consumo1);
    Consumo consumo3 = new Consumo(1000, 200, LocalDate.of(1990, 5, 6));
    Consumo consumo4 = new Consumo(1000, 200, LocalDate.of(1991, 6, 7));
    Consumo consumo5 = new Consumo(500, 100, LocalDate.of(1995, 6, 8));
    usuarioConMuchosConsumo.agregarConsumo(consumo3);
    usuarioConMuchosConsumo.agregarConsumo(consumo4);
    usuarioConMuchosConsumo.agregarConsumo(consumo5);
  }

  @Test
  void generarFacturaTest() {
    assertEquals(usuarioConConsumo.generarFactura().getMontoFinal(), 9000);
    assertEquals(usuarioSinConsumos.generarFactura(), null);
    assertEquals(usuarioConMuchosConsumo.generarFactura().getMontoFinal(), 4500);
  }

}

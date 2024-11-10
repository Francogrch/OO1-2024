package ar.edu.unlp.oo1.ejercicio23;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class PedidoTest {
  private Pedido sinCant;
  private Pedido valorBorde;
  private Pedido valorSobreBorde;

  @BeforeEach
  void setUp() throws Exception {
    sinCant = new Pedido(0, new RetirarComercio(), new AlContado(), new Producto("Banana", "Fruta", 100, 0));
    valorBorde = new Pedido(1, new RetirarComercio(), new AlContado(), new Producto("Tomate", "Verdura", 100, 0));
    valorSobreBorde = new Pedido(40, new RetirarComercio(), new AlContado(), new Producto("Banana", "Fruta", 100, 0));
  }

  @Test
  void costoTotalTest() {
    assertEquals(sinCant.costoTotal(), 0);
    assertEquals(valorBorde.costoTotal(), 100);
    assertEquals(valorSobreBorde.costoTotal(), 4000);
  }

  @Test
  void compararCategorias() {
    assertEquals(sinCant.compararCategoria("Fruta"), 0);
    assertEquals(valorBorde.compararCategoria("Verdura"), 1);
    assertEquals(valorSobreBorde.compararCategoria("Verdura"), 0);
  }
}

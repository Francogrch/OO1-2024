package ar.edu.unlp.oo1.ejercicio23;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ProductoTest {
  private Producto productoSinStock;
  private Producto productoConStock;
  private Producto productoBorde;

  @BeforeEach
  void setUp() throws Exception {
    productoSinStock = new Producto("Manzana", "Fruta", 100, 0);
    productoConStock = new Producto("Banana", "Fruta", 100, 30);
    productoBorde = new Producto("Tomate", "Verdura", 100, 7);
  }

  @Test
  void stockSufucienteTest() {
    assertFalse(productoSinStock.stockSuficiente(5));
    assertEquals(productoSinStock.getCant(), 0);

    assertTrue(productoConStock.stockSuficiente(5));
    assertEquals(productoConStock.getCant(), 25);

    assertTrue(productoBorde.stockSuficiente(7));
    assertEquals(productoBorde.getCant(), 0);
  }

  @Test
  void mismaCategoriaTest() {
    assertTrue(productoSinStock.mismaCategoria("Fruta"));
    assertTrue(productoBorde.mismaCategoria("Verdura"));
    assertFalse(productoConStock.mismaCategoria("Tuberculo"));
  }
}

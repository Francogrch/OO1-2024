package ar.edu.unlp.oo1.ejercicio23;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class UsuarioTest {
  private Usuario usuarioSinPedidos;
  private Usuario usuarioConPedidos;

  @BeforeEach
  void setUp() throws Exception {
    usuarioSinPedidos = new Usuario("Pedro", "Calle 58 870");
    usuarioConPedidos = new Usuario("Carlos", "Calle 78 870");

    usuarioConPedidos.crearPedido(10, new RetirarComercio(), new AlContado(), new Producto("Banana", "Fruta", 100, 10));
    usuarioConPedidos.crearPedido(5, new RetirarComercio(), new AlContado(), new Producto("Manzana", "Fruta", 100, 5));
    usuarioConPedidos.crearPedido(4, new RetirarComercio(), new AlContado(), new Producto("Tomate", "Verdura", 100, 5));
    usuarioConPedidos.crearPedido(10, new RetirarComercio(), new AlContado(),
        new Producto("Tomate", "Verdura", 100, 5));
  }

  @Test
  void cantCategoria() {
    assertEquals(usuarioSinPedidos.cantCategoria("Fruta"), 0);
    assertEquals(usuarioConPedidos.cantCategoria("Fruta"), 15);
    assertEquals(usuarioConPedidos.cantCategoria("Verdura"), 4);
  }

}

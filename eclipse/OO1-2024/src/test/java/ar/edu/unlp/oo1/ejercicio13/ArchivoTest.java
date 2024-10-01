package ar.edu.unlp.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ArchivoTest {
  private Archivo archivo1;
  private Archivo archivo2;

  @BeforeEach
  void setUp() throws Exception {
    archivo1 = new Archivo("Imagen");
    archivo2 = new Archivo("");
  }

  @Test
  void tamanioTest() {
    assertEquals(archivo1.tamanio(), 6);
    assertEquals(archivo2.tamanio(), 0);
  }

}

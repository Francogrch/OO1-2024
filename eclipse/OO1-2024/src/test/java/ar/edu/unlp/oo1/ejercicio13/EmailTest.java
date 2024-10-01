package ar.edu.unlp.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EmailTest {
  private Email email1;
  private Email email2;

  @BeforeEach
  void setUp() throws Exception {
    email1 = new Email("Expensas 2022", "El pago se ha realizado con exito.");
    email2 = new Email("Certificado Alumno Regular", "En el siguiente mail se adjunta el certificado.");
    Archivo certificado = new Archivo("Certificado");
    email2.agregarArchivo(certificado);
  }

  @Test
  void tieneTextoTest() {
    assertTrue(email1.tieneTexto("pago"));
    assertTrue(email1.tieneTexto("Expensas"));
    assertFalse(email2.tieneTexto("pago"));
    assertFalse(email2.tieneTexto("Expensas"));
  }

  @Test
  void tamanioTest() {
    assertEquals(email1.tamanio(), 0);
    assertEquals(email2.tamanio(), 11);
  }
}

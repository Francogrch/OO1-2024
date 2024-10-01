package ar.edu.unlp.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CarpetaTest {
  private Carpeta carpetaVacia;
  private Carpeta carpeta1;
  private Carpeta carpeta2;
  private Email email1;
  private Email email2;

  @BeforeEach
  void setUp() throws Exception {
    carpetaVacia = new Carpeta("Vacia");
    carpeta1 = new Carpeta("Inbox");
    carpeta2 = new Carpeta("Leidos");

    email1 = new Email("Expensas 2022", "El pago se ha realizado con exito.");
    email2 = new Email("Certificado Alumno Regular", "En el siguiente mail se adjunta el certificado.");
    Archivo certificado = new Archivo("Certificado");
    email2.agregarArchivo(certificado);

    carpeta1.agregarEmail(email1);
    carpeta1.agregarEmail(email2);

    carpeta2.agregarEmail(email1);
  }

  @Test
  void moverTest() {
    assertEquals(carpeta1.getEmails().size(), 2);
    carpeta1.mover(email1, carpeta2);
    assertFalse(carpeta1.getEmails().contains(email1));
    assertTrue(carpeta2.getEmails().contains(email1));
    assertEquals(carpeta1.getEmails().size(), 1);
  }

  @Test
  void buscarEmailTest() {
    assertEquals(carpeta1.buscarEmail("Expensas"), email1);
    assertEquals(carpeta1.buscarEmail("mail"), email2);
    assertEquals(carpeta1.buscarEmail("test"), null);
    assertEquals(carpetaVacia.buscarEmail("Expensas"), null);
  }

  @Test
  void tamanioTest() {
    assertEquals(carpetaVacia.tamanio(), 0);
    assertEquals(carpeta1.tamanio(), 11);
    assertEquals(carpeta2.tamanio(), 0);
  }
}

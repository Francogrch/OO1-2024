package ar.edu.unlp.oo1.ejercicio22;

import ar.edu.unlp.oo1.ejercicio13.Archivo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class CarpetaTest {
  private Carpeta carpetaVacia;
  private Carpeta carpeta1;
  private Carpeta carpeta2;
  private Email email1;
  private Email email2, email3;

  @BeforeEach
  void setUp() throws Exception {
    carpetaVacia = new Carpeta("Vacia");
    carpeta1 = new Carpeta("Inbox");
    carpeta2 = new Carpeta("Leidos");
    carpetaVacia = new Carpeta("Vacia");

    email1 = new Email("Expensas 2022", "El pago se ha realizado con exito.");
    email2 = new Email("Certificado Alumno Regular", "En el siguiente mail se adjunta el certificado.");

    email3 = new Email("Vacanciones 2012", "En el siguiente mail se adjunta las fotos de las vacaciones.");

    Archivo fotoPequenia = new Archivo(
        "ajsdklfjaskldjflkasjdfklajsdklfjaskldfjkalsdjfklajsdklfjaskldfjaklsdjfklasjdfklajsdklfjaskldjfkdlajfklasjdklfjaskldfjklasdjflkasjdflkjasdjkfjaklsjdkfljakljdkfjklasdjkfjklasjkldfjkasjdklfjklaksdjfklajsdklfjasjkasdfasdfasdfjaksdjfkasjdfkjassdasdasdasds");
    Archivo fotoMediana = new Archivo(
        "lasldfkjasdklfjaskldjfklasjdfklajsdklfjaskldjflkasjdfklajsdklfjaskldfjkalsdjfklajsdklfjaskldfjaklsdjfklasjdfklajsdklfjaskldjfkdlajfklasjdklfjaskldfjklasdjflkasjdflkjasdjkfjaklsjdkfljakljdkfjklasdjkfjklasjkldfjkasjdklfjklaksdjfklajsdklfjasjkldfjkaskldfjklasjkldfkjasklfjdalksdjfklasjdfkljasdklfjaskldfjalksdjflkasjdfklasjdklfjaskldfjaslkdjfklasdjfklasjdfkljsakdlfjaskldfjaskldjfaklsdjfkasldjfaksldjfklas");
    Archivo fotoGrande = new Archivo(
        "lasldfkjasdklfjaskldjfklasjdfklajsdklfjaskldjflkasjdfklajsdklfjaskldfjkalsdjfklajsdklfjaskldfjaklsdjfklasjdfklajsdklfjaskldjfkdlajfklasjdklfjaskldfjklasdjflkasjdflkjasdjkfjaklsjdkfljakljdkfjklasdjkfjklasjkldfjkasjdklfjklaksdjfklajsdklfjasjkldfjkaskldfjklasjkldfkjasklfjdalksdjfklasjdfkljasdklfjaskldfjalksdjflkasjdfklasjdklfjaskldfjaslkdjfklasdjfklasjdfkljsakdlfjaskldfjaskldjfaklsdjfkasldjfaksldjfklasjdfklajsdklfjaskldjfklasjdfkljasdklfjaskldjfkasljdfklasjdfklasjdfklajsdklfjaskldjfaklsjdfklasjdfklasjdklfjaskldfjaskldjfkalsjdfXsjkfhSHflkasjkxhJKFKDJskdjasfhLXKSHJflaskdfhjfLSKFDHJFlkasdfhjjadkIKJHfhsjkfsa");

    email1.agregarArchivo(fotoPequenia);
    email2.agregarArchivo(fotoMediana);
    email3.agregarArchivo(fotoGrande);

    carpeta1.agregarEmail(email1);
    carpeta1.agregarEmail(email2);
    carpeta1.agregarEmail(email3);

    carpeta2.agregarEmail(email1);
  }

  @Test
  void moverTest() {
    assertEquals(carpeta1.getEmails().size(), 3);
    carpeta1.mover(email1, carpeta2);
    assertFalse(carpeta1.getEmails().contains(email1));
    assertTrue(carpeta2.getEmails().contains(email1));
    assertEquals(carpeta1.getEmails().size(), 2);
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
    assertEquals(carpeta1.tamanio(), 1260);
    assertEquals(carpeta2.tamanio(), 250);
  }

  @Test
  void tamanioCategoriaTest() {

    assertEquals(email1.categoriaTamanio(), "pequenio");

    assertEquals(carpetaVacia.tamanioCategoria().get("pequenio"), 0);
    assertEquals(carpetaVacia.tamanioCategoria().get("mediano"), 0);
    assertEquals(carpetaVacia.tamanioCategoria().get("grande"), 0);

    assertEquals(carpeta1.tamanioCategoria().get("pequenio"), 1);
    assertEquals(carpeta1.tamanioCategoria().get("mediano"), 1);
    assertEquals(carpeta1.tamanioCategoria().get("grande"), 1);

    assertEquals(carpeta2.tamanioCategoria().get("pequenio"), 1);
    assertEquals(carpeta2.tamanioCategoria().get("mediano"), 0);
    assertEquals(carpeta2.tamanioCategoria().get("grande"), 0);
  }
}

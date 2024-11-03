package ar.edu.unlp.oo1.ejercicio22;

import ar.edu.unlp.oo1.ejercicio13.Archivo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class EmailTest {
  private Email email1;
  private Email email2, email3, email4;

  @BeforeEach
  void setUp() throws Exception {
    email1 = new Email("Expensas 2022", "El pago se ha realizado con exito.");
    email2 = new Email("Certificado Alumno Regular", "En el siguiente mail se adjunta el certificado.");
    Archivo certificado = new Archivo("Certificado");
    email2.agregarArchivo(certificado);
    Archivo fotoPequenia = new Archivo(
        "ajsdklfjaskldjflkasjdfklajsdklfjaskldfjkalsdjfklajsdklfjaskldfjaklsdjfklasjdfklajsdklfjaskldjfkdlajfklasjdklfjaskldfjklasdjflkasjdflkjasdjkfjaklsjdkfljakljdkfjklasdjkfjklasjkldfjkasjdklfjklaksdjfklajsdklfjasjkasdfasdfasdfjaksdjfkasjdfkjassdasdasdasds");
    Archivo fotoMediana = new Archivo(
        "lasldfkjasdklfjaskldjfklasjdfklajsdklfjaskldjflkasjdfklajsdklfjaskldfjkalsdjfklajsdklfjaskldfjaklsdjfklasjdfklajsdklfjaskldjfkdlajfklasjdklfjaskldfjklasdjflkasjdflkjasdjkfjaklsjdkfljakljdkfjklasdjkfjklasjkldfjkasjdklfjklaksdjfklajsdklfjasjkldfjkaskldfjklasjkldfkjasklfjdalksdjfklasjdfkljasdklfjaskldfjalksdjflkasjdfklasjdklfjaskldfjaslkdjfklasdjfklasjdfkljsakdlfjaskldfjaskldjfaklsdjfkasldjfaksldjfklas");
    Archivo fotoGrande = new Archivo(
        "lasldfkjasdklfjaskldjfklasjdfklajsdklfjaskldjflkasjdfklajsdklfjaskldfjkalsdjfklajsdklfjaskldfjaklsdjfklasjdfklajsdklfjaskldjfkdlajfklasjdklfjaskldfjklasdjflkasjdflkjasdjkfjaklsjdkfljakljdkfjklasdjkfjklasjkldfjkasjdklfjklaksdjfklajsdklfjasjkldfjkaskldfjklasjkldfkjasklfjdalksdjfklasjdfkljasdklfjaskldfjalksdjflkasjdfklasjdklfjaskldfjaslkdjfklasdjfklasjdfkljsakdlfjaskldfjaskldjfaklsdjfkasldjfaksldjfklasjdfklajsdklfjaskldjfklasjdfkljasdklfjaskldjfkasljdfklasjdfklasjdfklajsdklfjaskldjfaklsjdfklasjdfklasjdklfjaskldfjaskldjfkalsjdfXsjkfhSHflkasjkxhJKFKDJskdjasfhLXKSHJflaskdfhjfLSKFDHJFlkasdfhjjadkIKJHfhsjkfsa");

    email1.agregarArchivo(fotoPequenia);
    email3.agregarArchivo(fotoMediana);
    email4.agregarArchivo(fotoGrande);

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

  @Test
  void categoriaTamanio() {
    assertEquals(email1.categoriaTamanio(), "pequenia");
    assertEquals(email3.categoriaTamanio(), "mediana");
    assertEquals(email4.categoriaTamanio(), "grande");
  }
}

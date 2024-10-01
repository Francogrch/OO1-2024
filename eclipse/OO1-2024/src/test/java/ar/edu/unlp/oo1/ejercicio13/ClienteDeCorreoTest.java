package ar.edu.unlp.oo1.ejercicio13;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ClienteDeCorreoTest {
  private ClienteDeCorreo cliente;
  private ClienteDeCorreo clienteVacio;

  private Email email1;
  private Email email2;
  private Email email3;

  @BeforeEach
  void setUp() throws Exception {
    cliente = new ClienteDeCorreo();
    clienteVacio = new ClienteDeCorreo();
    email1 = new Email("Mensaje importante", "Te ganaste un sorteo. Ingresa tus datos ;)");
    email2 = new Email("Certificado Alumno Regular", "En el siguiente mail se adjunta el certificado.");
    Archivo certificado = new Archivo("Certificado");
    email2.agregarArchivo(certificado);
    email3 = new Email("Expensas 2022", "El pago se ha realizado con exito.");
    cliente.recibir(email2);
    Carpeta spam = new Carpeta("Spam");
    spam.agregarEmail(email1);
    cliente.agregarCarpeta(spam);
  }

  @Test
  void recibirTest() {
    assertFalse(clienteVacio.getInbox().getEmails().contains(email1));
    clienteVacio.recibir(email1);
    assertTrue(clienteVacio.getInbox().getEmails().contains(email1));
  }

  @Test
  void buscarTest() {
    cliente.recibir(email3);
    cliente.recibir(email2);
    assertEquals(cliente.buscar("Expensas"), email3);
    assertEquals(cliente.buscar("mail"), email2);
    assertEquals(cliente.buscar("ganaste"), email1);
  }

  @Test
  void espacioOcupadoTest() {
    assertEquals(cliente.espacioOcuapdo(), 11);
    assertEquals(clienteVacio.espacioOcuapdo(), 0);
  }
}

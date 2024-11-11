package ar.edu.unlp.oo1.ejercicio25;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.LocalDate;

public class VeterinarioTest {

  private Veterinario veterianarioViejo;
  private Veterinario veterianarioNuevo;

  @BeforeEach
  void setUp() throws Exception {
    veterianarioViejo = new Veterinario("Juan", LocalDate.of(1994, 12, 1), (double) 10000);
    veterianarioNuevo = new Veterinario("Elon", LocalDate.of(2024, 1, 1), (double) 10000);
  }

  @Test
  void getAntiguedadTest() {
    assertEquals(veterianarioNuevo.getAntiguedad(), 0);
    assertEquals(veterianarioViejo.getAntiguedad(), 30);
  }

}

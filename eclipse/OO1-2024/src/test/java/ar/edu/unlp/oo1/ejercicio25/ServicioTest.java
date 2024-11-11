package ar.edu.unlp.oo1.ejercicio25;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.LocalDate;

public class ServicioTest {
  private ServicioGuarderia servicioGuarderiaCon5;
  private ServicioGuarderia servicioGuarderiaConMenos;
  private Mascota mascotaMas5;
  private Mascota mascotaMenos5;

  private ConsultaMedica consultaMedicaDomingo;
  private ConsultaMedica consultaMedicaNoDomingo;

  private Vacunacion vacunacionDomingo;
  private Vacunacion vacunacionNoDomingo;

  @BeforeEach
  void setUp() throws Exception {
    Veterinario veterinario = new Veterinario("Juan", LocalDate.of(1994, 12, 1), (double) 100);

    mascotaMas5 = new Mascota("Pepe", "Sapo", LocalDate.of(1994, 11, 20));
    mascotaMenos5 = new Mascota("Baldo", "Perro", LocalDate.of(2000, 7, 5));

    servicioGuarderiaCon5 = mascotaMas5.darAltaGuarderia(4);
    servicioGuarderiaConMenos = mascotaMenos5.darAltaGuarderia(4);

    consultaMedicaDomingo = mascotaMas5.darAltaConsulta(veterinario);
    consultaMedicaDomingo.setFecha(LocalDate.of(2024, 11, 10));
    consultaMedicaNoDomingo = mascotaMas5.darAltaConsulta(veterinario);
    consultaMedicaNoDomingo.setFecha(LocalDate.of(2024, 11, 11));

    vacunacionDomingo = mascotaMas5.darAltaVacunacion(veterinario, "Pzifer", 100);
    vacunacionDomingo.setFecha(LocalDate.of(2024, 11, 10));
    vacunacionNoDomingo = mascotaMas5.darAltaVacunacion(veterinario, "Astrazeneca", 100);
    vacunacionNoDomingo.setFecha(LocalDate.of(2024, 11, 11));

  }

  @Test
  void costo() {
    assertEquals(servicioGuarderiaCon5.costo(), 1800);
    assertEquals(servicioGuarderiaConMenos.costo(), 2000);
    assertEquals(consultaMedicaDomingo.costo(), 3600);
    assertEquals(consultaMedicaNoDomingo.costo(), 3400);
    assertEquals(vacunacionDomingo.costo(), 900);
    assertEquals(vacunacionNoDomingo.costo(), 700);
  }
}

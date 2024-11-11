package ar.edu.unlp.oo1.ejercicio25;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.LocalDate;

public class MascotaTest {
  private Mascota mascotaVacia;
  private Mascota mascotaConServicios;
  private Mascota mascotaConMasServicios;
  private Mascota mascotaConMenosServicios;

  @BeforeEach
  void setUp() throws Exception {
    mascotaVacia = new Mascota("Pepe", "Sapo", LocalDate.of(1994, 11, 20));
    mascotaConServicios = new Mascota("Baldo", "Perro", LocalDate.of(2000, 7, 5));
    mascotaConMenosServicios = new Mascota("Alex", "Leon", LocalDate.of(1890, 2, 10));

    Veterinario vet1 = new Veterinario("Carlos", LocalDate.of(11, 23, 1987), 1000);
    mascotaConServicios.darAltaConsulta(vet1).setFecha(LocalDate.of(2007, 11, 11));
    mascotaConServicios.darAltaVacunacion(vet1, "Pzifer", 200).setFecha(LocalDate.of(2007, 11, 11));
    ;
    mascotaConServicios.darAltaGuarderia(10).setFecha(LocalDate.of(2008, 11, 11));
    ;
    mascotaConServicios.darAltaVacunacion(vet1, "Astrazeneca", 200);
    mascotaConServicios.darAltaConsulta(vet1);

    mascotaConMenosServicios.darAltaConsulta(vet1);
    mascotaConMenosServicios.darAltaVacunacion(vet1, "Pzifer", 200);
    mascotaConMenosServicios.darAltaGuarderia(10);
    mascotaConMenosServicios.darAltaVacunacion(vet1, "Astrazeneca", 200);

  }

  @Test
  void utilizoMasDe5() {
    assertTrue(mascotaConServicios.utilizoMasDe5());
    assertFalse(mascotaVacia.utilizoMasDe5());
    assertFalse(mascotaConMenosServicios.utilizoMasDe5());
  }

  @Test
  void recaudacionTest() {
    LocalDate fecha1 = LocalDate.of(2007, 11, 11);
    assertEquals(mascotaConServicios.recaudacion(fecha1), 63400);
    assertEquals(mascotaConServicios.recaudacion(fecha1.minusDays(5)), 0);
    assertEquals(mascotaVacia.recaudacion(fecha1), 0);
  }

}

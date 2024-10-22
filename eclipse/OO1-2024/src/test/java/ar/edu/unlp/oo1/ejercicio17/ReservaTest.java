package ar.edu.unlp.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.*;

import ar.edu.unlp.oo1.ejercicio14b.DateLapse;

import java.time.LocalDate;

public class ReservaTest {
  private Reserva reserva1;

  @BeforeEach
  void setUp() throws Exception {

    Propiedad p1 = new Propiedad("Casa", "Ca 549 98", 1000);
    reserva1 = new Reserva(new DateLapse(LocalDate.of(2024, 1, 1), LocalDate.of(2024, 1, 7)), p1);
  }

  @Test
  void calcularPrecioTest() {
    assertEquals(reserva1.calcularPrecio(), 7000);
    assertEquals(reserva1.calcularPrecio(new DateLapse(LocalDate.of(2024, 1, 4), LocalDate.of(2024, 1, 8))), 4000);
    assertEquals(reserva1.calcularPrecio(new DateLapse(LocalDate.of(2025, 1, 4), LocalDate.of(2025, 1, 8))), 0);
  }

  @Test
  void overlapTest() {
    assertTrue(reserva1.overlap(new DateLapse(LocalDate.of(2024, 1, 5), LocalDate.of(2024, 1, 6))));
    assertFalse(reserva1.overlap(new DateLapse(LocalDate.of(2024, 1, 5), LocalDate.of(2024, 2, 7))));
    assertFalse(reserva1.overlap(new DateLapse(LocalDate.of(2024, 1, 10), LocalDate.of(2024, 2, 15))));
  }

}

package ar.edu.unlp.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.util.Date;

import org.junit.jupiter.api.*;

import ar.edu.unlp.oo1.ejercicio14b.DateLapse;

public class PropiedadTest {
  private Propiedad propiedadConReservas;
  private Propiedad propiedadSinReservas;

  @BeforeEach
  void setUp() throws Exception {
    Propiedad propiedadConReservas = new Propiedad("Casa", "Ca 549 98", 1000);
    Propiedad propiedadSinReservas = new Propiedad("Depto", "Av 9 89", 3000);

    propiedadConReservas.crearReserva(new DateLapse(LocalDate.of(2024, 5, 6), LocalDate.of(2024, 5, 10)));
    propiedadConReservas.crearReserva(new DateLapse(LocalDate.of(2024, 7, 10), LocalDate.of(2024, 7, 22)));
  }

  @Test
  void disponibleTest() {
    assertTrue(propiedadConReservas.disponible(new DateLapse(LocalDate.of(2024, 1, 2), LocalDate.of(2024, 1, 10))));
    assertFalse(propiedadConReservas.disponible(new DateLapse(LocalDate.of(2024, 5, 3), LocalDate.of(2024, 5, 10))));
    assertFalse(propiedadConReservas.disponible(new DateLapse(LocalDate.of(2024, 5, 7), LocalDate.of(2024, 5, 9))));
    assertTrue(propiedadSinReservas.disponible(new DateLapse(LocalDate.of(2024, 5, 7), LocalDate.of(2024, 5, 9))));
  }

  @Test
  void crearReservaTest() {
    assertTrue(propiedadConReservas.crearReserva(new DateLapse(LocalDate.of(2024, 1, 2), LocalDate.of(2024, 1, 10))));
    assertFalse(propiedadConReservas.crearReserva(new DateLapse(LocalDate.of(2024, 5, 3), LocalDate.of(2024, 5, 10))));
    assertFalse(propiedadConReservas.crearReserva(new DateLapse(LocalDate.of(2024, 5, 7), LocalDate.of(2024, 5, 9))));
    assertTrue(propiedadSinReservas.crearReserva(new DateLapse(LocalDate.of(2024, 5, 7), LocalDate.of(2024, 5, 9))));
  }

  @Test
  void calcularIngresoTest() {
    assertEquals(
        propiedadSinReservas.calcularIngreso(new DateLapse(LocalDate.of(2024, 1, 2), LocalDate.of(2024, 1, 4))), 0);
    assertEquals(
        propiedadConReservas.calcularIngreso(new DateLapse(LocalDate.of(2024, 5, 2), LocalDate.of(2024, 7, 23))),
        17000);
    assertEquals(
        propiedadConReservas.calcularIngreso(new DateLapse(LocalDate.of(2024, 5, 7), LocalDate.of(2024, 7, 23))),
        14000);
    assertEquals(
        propiedadConReservas.calcularIngreso(new DateLapse(LocalDate.of(2024, 6, 7), LocalDate.of(2024, 6, 23))), 0);
  }
}

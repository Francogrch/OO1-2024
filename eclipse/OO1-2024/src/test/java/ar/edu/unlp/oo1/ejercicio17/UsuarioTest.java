package ar.edu.unlp.oo1.ejercicio17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import ar.edu.unlp.oo1.ejercicio14b.DateLapse;
import java.time.LocalDate;

public class UsuarioTest {
  private Usuario userSinProp;
  private Usuario userConProp;
  private Usuario userConPropSinReserva;

  @BeforeEach
  void setUp() throws Exception {
    userSinProp = new Usuario("Carlos", "Av 7 687", 22223);
    userConProp = new Usuario("Julia", "Av 9 687", 2451);
    userConPropSinReserva = new Usuario("Mark", "Calle 8 98", 123);

    Propiedad propSinReserva = new Propiedad("Casa", "Ca 549 98", 1200);
    Propiedad propConReserva = new Propiedad("Depto", "Ca 7 989", 1000);

    propConReserva.crearReserva(new DateLapse(LocalDate.of(2024, 1, 2), LocalDate.of(2024, 1, 7))); // 6000
    propConReserva.crearReserva(new DateLapse(LocalDate.of(2024, 2, 2), LocalDate.of(2024, 3, 7))); // 34000
    userConPropSinReserva.agregarPropiedad(propSinReserva);
    userConProp.agregarPropiedad(propConReserva);
  }

  @Test
  void calcularIngresoTest() {
    DateLapse periodo1 = new DateLapse(LocalDate.of(2024, 1, 3), LocalDate.of(2024, 5, 5));
    DateLapse periodo2 = new DateLapse(LocalDate.of(2024, 1, 5), LocalDate.of(2024, 3, 3));
    assertEquals(userConPropSinReserva.calcularIngreso(periodo1), 0);
    assertEquals(userSinProp.calcularIngreso(periodo1), 0);
    assertEquals(userConProp.calcularIngreso(periodo1), 40000);
    assertEquals(userConProp.calcularIngreso(periodo2), 32000);
  }

}

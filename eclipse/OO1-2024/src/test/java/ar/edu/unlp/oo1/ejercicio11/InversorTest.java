package ar.edu.unlp.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;

public class InversorTest {
  private Inversor i1;
  private PlazoFijo p1;
  private PlazoFijo p2;
  private InversionEnAcciones a1;
  private InversionEnAcciones a2;

  @BeforeEach
  void setUp() throws Exception {
    i1 = new Inversor("Pedro");
    p1 = new PlazoFijo(LocalDate.of(1990, 12, 1), 200, 0.20);
    p2 = new PlazoFijo(LocalDate.of(2000, 12, 1), 200, 0.20);
    a1 = new InversionEnAcciones("USD", 2, 200);
    a2 = new InversionEnAcciones("EUR", 2, 300);
    i1.addInversion(p1);
    i1.addInversion(p2);
    i1.addInversion(a1);
    i1.addInversion(a2);
  }

  @Test
  void valorActual() {
    assertEquals(i1.valorActual(), 11560);
  }
}

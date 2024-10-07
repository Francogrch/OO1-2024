package ar.edu.unlp.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.time.LocalDate;

public class DateLapseTest {
  private DateLapse dl;
  private DateLapse dl2;

  @BeforeEach
  void setUp() throws Exception {
    dl = new DateLapse(LocalDate.of(2000, 2, 2), LocalDate.of(2000, 2, 4));
    dl2 = new DateLapse(LocalDate.of(1900, 12, 31), LocalDate.of(2000, 1, 1));
  }

  @Test
  void sizeInDaysTest() {
    assertEquals(dl.sizeInDays(), 2);
    assertEquals(dl2.sizeInDays(), 36160);
  }

  @Test
  void includesDateTest() {
    assertTrue(dl.includesDate(LocalDate.of(2000, 2, 3)));
    assertFalse(dl.includesDate(LocalDate.of(2000, 2, 5)));
    assertTrue(dl2.includesDate(LocalDate.of(1999, 2, 5)));
    assertFalse(dl2.includesDate(LocalDate.of(1800, 2, 5)));
  }
}

package ar.edu.unlp.oo1.ejercicio12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class ReporteDeConstruccionTest {

  private ReporteDeConstruccion reporteVacio;
  private ReporteDeConstruccion reporte1;
  private ReporteDeConstruccion reporte2;

  @BeforeEach
  void setUp() throws Exception {
    reporteVacio = new ReporteDeConstruccion();
    reporte1 = new ReporteDeConstruccion();
    reporte2 = new ReporteDeConstruccion();

    Cilindro c1 = new Cilindro(1, 2, "hierro", "azul");
    PrismaRectangular p1 = new PrismaRectangular(1, 2, 3, "hierro", "verde");
    Esfera e1 = new Esfera(1, "plomo", "azul");

    reporte1.addPieza(c1);
    reporte1.addPieza(p1);
    reporte1.addPieza(e1);

    reporte2.addPieza(p1);
    reporte2.addPieza(e1);
  }

  @Test
  void getVolumenDeMaterialTest() {
    assertEquals(reporte1.getVolumenDeMaterial("hierro"), 12);
    assertEquals(reporte1.getVolumenDeMaterial("plomo"), 12);
    assertEquals(reporteVacio.getVolumenDeMaterial("plata"), 0);
    assertEquals(reporte2.getVolumenDeMaterial("plata"), 0);
  }

  @Test
  void getSuperficieDeColorTest() {
    assertEquals(reporteVacio.getSuperficieDeColor("blanco"), 0);
    assertEquals(reporte1.getSuperficieDeColor("azul"), 12);
    assertEquals(reporte1.getSuperficieDeColor("verde"), 12);
    assertEquals(reporte2.getSuperficieDeColor("blanco"), 0);
  }

}

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

    Cilindro c1 = new Cilindro(3, 5, "hierro", "azul");
    // s 151, v 141
    PrismaRectangular p1 = new PrismaRectangular(6, 4, 8, "hierro", "verde");
    // s 206, v 192
    Esfera e1 = new Esfera(4, "plomo", "azul");
    // s 201, v 268
    reporte1.addPieza(c1);
    reporte1.addPieza(p1);
    reporte1.addPieza(e1);

    reporte2.addPieza(p1);
    reporte2.addPieza(e1);
  }

  @Test
  void getVolumenDeMaterialTest() {
    assertEquals(reporte1.getVolumenDeMaterial("hierro"), 333); // 141 + 192
    assertEquals(reporte1.getVolumenDeMaterial("plomo"), 268); // 268
    assertEquals(reporteVacio.getVolumenDeMaterial("hierro"), 0); // 0
    assertEquals(reporte2.getVolumenDeMaterial("plata"), 0); // 0
  }

  @Test
  void getSuperficieDeColorTest() {
    assertEquals(reporteVacio.getSuperficieDeColor("azul"), 0); // 0
    assertEquals(reporte1.getSuperficieDeColor("azul"), 352); // 201 + 151
    assertEquals(reporte1.getSuperficieDeColor("verde"), 208); // 208
    assertEquals(reporte2.getSuperficieDeColor("blanco"), 0); // 0
  }

}

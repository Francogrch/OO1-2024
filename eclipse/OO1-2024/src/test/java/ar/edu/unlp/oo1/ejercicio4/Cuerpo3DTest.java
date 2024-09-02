package ar.edu.unlp.oo1.ejercicio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Cuerpo3DTest {
    Circulo circu;
    Cuerpo3D cuerpo;
    @BeforeEach
    void setUp() throws Exception{
        circu = new Circulo(5);
        cuerpo = new Cuerpo3D(circu,10);
    }
    @Test
    void getSuperficieExterior() {
        assertEquals(cuerpo.getSuperficieExterior(),468);
    }

    @Test
    void getVolumen() {
        assertEquals(cuerpo.getVolumen(),790);
    }
}
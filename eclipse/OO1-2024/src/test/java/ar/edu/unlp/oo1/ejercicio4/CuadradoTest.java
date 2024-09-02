package ar.edu.unlp.oo1.ejercicio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuadradoTest {
    Cuadrado cuadra;
    @BeforeEach
    void setUp()throws Exception{
       cuadra = new Cuadrado(4) ;
    }
    @Test
    void getArea() {
        assertEquals(cuadra.getArea(),16);
    }

    @Test
    void getPerimetro() {
        assertEquals(cuadra.getPerimetro(),16);
    }
}
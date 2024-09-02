package ar.edu.unlp.oo1.ejercicio4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {
    Circulo cir;
    @BeforeEach
    void setUp() throws Exception{
       cir = new Circulo(2.5);
    }

    @Test
    void getPerimetro() {
        assertEquals(cir.getPerimetro(),16);
    }

    @Test
    void getArea() {
        assertEquals(cir.getArea(),20);
    }

    @Test
    void getDiamentro() {

        assertEquals(cir.getDiamentro(),5);
    }
}
package ar.edu.unlp.oo1.ejercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {
    Item i1;
    @BeforeEach
    void setUp() throws Exception{
        i1 = new Item("pan",2,100);
    }
    @Test
    void costo() {
        assertEquals(i1.costo(), 200);
    }
}
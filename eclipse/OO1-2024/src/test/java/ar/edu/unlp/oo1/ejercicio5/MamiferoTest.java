package ar.edu.unlp.oo1.ejercicio5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MamiferoTest {
    Mamifero nala,melquiades,mufasa,alexa,elsa,scar,sarabi;

    @BeforeEach
    void setUp() throws Exception{
       nala = new Mamifero("1","Mamut", LocalDate.now());
       melquiades = new Mamifero("2","Mamut",LocalDate.now());
       elsa = new Mamifero("3","Mamut", LocalDate.now());
       scar = new Mamifero("4","Mamut", LocalDate.now());
       mufasa = new Mamifero("4","Mamut", LocalDate.now(),melquiades,nala);
       sarabi = new Mamifero("4","Mamut", LocalDate.now(),scar,elsa);
       alexa = new Mamifero("4","Mamut", LocalDate.now(),mufasa,sarabi);
    }
    @Test
    void tieneComoAncestro() {
        assertTrue(alexa.tieneComoAncestro(nala));
        assertFalse(sarabi.tieneComoAncestro(melquiades));
    }
}
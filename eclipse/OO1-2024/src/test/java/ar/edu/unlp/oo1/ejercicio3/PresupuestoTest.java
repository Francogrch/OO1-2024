package ar.edu.unlp.oo1.ejercicio3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;
/*
¿Cuáles son las variables de instancia de cada clase?
Presupuesto: fecha,cliente,items
Item: detalle,costoUnitario,cantidad

¿Qué variables inicializa y cómo?
Obligatoriamente se debe inicializar items, ya que es un List<>. Los demas tiene valores por defecto, aunque siempre es mejor especificar el valor inicial.
 */
class PresupuestoTest {

    Presupuesto pre1;
    Presupuesto pre2;
    Item i1,i2,i3;
    @BeforeEach
    void setUp() throws Exception {
        pre1 = new Presupuesto(LocalDate.now(),"Cliente 1");
        i1 = new Item("pan",3,20.5);
        i2 = new Item("leche",4,70);

    }
    @Test
    void calcularTotal() {
        pre1.agregarItem(i1);
        pre1.agregarItem(i2);
        assertEquals(pre1.calcularTotal(),341.5);

   }

   @Test
    void agregarItem(){
        pre1.agregarItem(i1);
        pre1.agregarItem(i2);
        assertEquals(pre1.getItems().size(),2);
   }
}
package src2.Ejercicio2_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
Ejercicio2_4.Customer c1= new Ejercicio2_4.Customer(18034751,"Nombre1",4);
    @Test
    void getId() {
        assertEquals(18034751,c1.getId());
    }

    @Test
    void getName() {
        assertEquals("Nombre1",c1.getName());
    }

    @Test
    void setName() {
        c1.setName("Nombre2");

        assertEquals("Nombre2",c1.getName());
    }

    @Test
    void getDiscount() {
        assertEquals(4,c1.getDiscount());
    }

    @Test
    void setDiscount() {
        c1.setDiscount(7);
        assertEquals(7,c1.getDiscount());
    }

    @Test
    void testToString() {
        c1.toString();
    }
}
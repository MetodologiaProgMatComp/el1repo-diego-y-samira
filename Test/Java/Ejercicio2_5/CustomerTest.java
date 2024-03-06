package src2.Ejercicio2_5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    Ejercicio2_5.Customer c1 = new Ejercicio2_5.Customer(12345,"Ramón", 'M');
    @Test
    void getId() {
        assertEquals(12345,c1.getId());
    }

    @Test
    void getName() {
        assertEquals("Ramón", c1.getName());
    }

    @Test
    void getGender() {
        assertEquals('M', c1.getGender());
    }

    @Test
    void testToString() {
        c1.toString();
    }
}
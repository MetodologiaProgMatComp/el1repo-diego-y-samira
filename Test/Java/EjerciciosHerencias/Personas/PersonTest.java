package EjerciciosHerencias.Personas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1 = new Person("Diego", "Seseña");
    @Test
    void getName() {
        assertEquals("Diego",p1.getName());

    }

    @Test
    void getAddress() {

        assertEquals("Seseña",p1.getAddress());

    }

    @Test
    void setAddress() {
        p1.setAddress("Guadalajara");
        assertEquals("Guadalajara",p1.getAddress());
    }

    @Test
    void testToString() {
        p1.toString();
    }
}
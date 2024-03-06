package src2.Ejercicio2_2;

import Ejercicio2_2.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthorTest {
Ejercicio2_2.Author a1 = new Author("Autor 1", "Autor1@gmail.com", "G");
    @Test
    void getName() {
        assertEquals("Autor 1", a1.getName());
    }

    @Test
    void getGender() {
        assertEquals("G", a1.getGender());
    }

    @Test
    void getEmail() {

        assertEquals("Autor1@gmail.com", a1.getEmail());
    }

    @Test
    void setEmail() {
        a1.setEmail("NuevoCorreo@hotmail.com");
        assertEquals("NuevoCorreo@hotmail.com", a1.getEmail());
    }

    @Test
    void testToString() {
        a1.toString();
    }
}
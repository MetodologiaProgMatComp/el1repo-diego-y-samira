package src2.Ejercicio2_2;

import Ejercicio2_2.Author;
import Ejercicio2_2.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Ejercicio2_2.Author a1 = new Ejercicio2_2.Author("Autor 1", "Autor1@gmail.com", "G");
    Ejercicio2_2.Author a2 = new Ejercicio2_2.Author("Autor 2", "Autor2@gmail.com", "J");
    Ejercicio2_2.Author[] autores1 = new Ejercicio2_2.Author[1];

    Ejercicio2_2.Author[] autores2 = new Ejercicio2_2.Author[2];
   // autores2[0] = a2;


    Ejercicio2_2.Book b1 = new Book("El señor de los anillos",autores1,40);

    Ejercicio2_2.Book b2 = new Book("Harry Potter",autores2,45,200);

    @Test
    void getName() {
        assertEquals("Harry Potter", b2.getName());
    }

    @Test
    void setName() {
        b2.setName("El hechicero del flequillo rebelde");
        assertEquals("El hechicero del flequillo rebelde", b2.getName());
    }

    @Test
    void getPrice() {
        assertEquals(40,b1.getPrice());
    }

    @Test
    void setPrice() {
b1.setPrice(50);
        assertEquals(50,b1.getPrice());
    }

    @Test
    void getQty() {
        assertEquals(200,b2.getQty());
    }

    @Test
    void setQty() {
 b1.setQty(120);
        assertEquals(120,b1.getQty());
    }

    @Test
    void getAutores() {
        assertEquals(autores1,b1.getAutores());
    }

    @Test
    void getAuthorNames() {
            assertEquals("Autor 2",b2.getAuthorNames());
    }

    @Test
    void testToString() {
        b2.toString();
    }
}
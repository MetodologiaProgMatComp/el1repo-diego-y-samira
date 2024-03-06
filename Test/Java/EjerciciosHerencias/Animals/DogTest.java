package EjerciciosHerencias.Animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DogTest {
    Dog d1 = new Dog("Coco");
    Dog d2 = new Dog("Shira");
    @Test
    void greets() {
        d1.greets();
    }

    @Test
    void testGreets() {
        d1.greets(d2);

    }

    @Test
    void testToString() {
        d2.toString();
    }
}
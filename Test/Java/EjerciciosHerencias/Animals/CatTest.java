package EjerciciosHerencias.Animals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    Cat c1 = new Cat("Tom");
    @Test
    void greets() {
        c1.greets();
    }

    @Test
    void testToString() {
        c1.toString();
    }
}
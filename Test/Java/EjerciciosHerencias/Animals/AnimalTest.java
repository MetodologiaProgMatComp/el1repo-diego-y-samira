package EjerciciosHerencias.Animals;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal a1 = new Animal("Peréz");
    @org.junit.jupiter.api.Test
    void testToString() {
        a1.toString();
    }
}
package src4.Ejercicio_6_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    src4.Ejercicio_6_3.MovablePoint mp1 = new src4.Ejercicio_6_3.MovablePoint(0, 0, 2, 3);

    @Test
    void moveUp() {
        mp1.moveUp();
        assertEquals(3, mp1.y);
    }

    @Test
    void moveDown() {
        mp1.moveDown();
        assertEquals(-3, mp1.y);
    }

    @Test
    void moveLeft() {

        mp1.moveLeft();
        assertEquals(-2, mp1.x);
    }

    @Test
    void moveRight() {

        mp1.moveRight();
        assertEquals(2, mp1.x);
    }
}

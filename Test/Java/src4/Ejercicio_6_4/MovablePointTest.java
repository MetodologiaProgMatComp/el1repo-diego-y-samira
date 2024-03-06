package Ejercicio_6_4;

import Ejercicio_6_4.MovablePoint;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    Ejercicio_6_4.MovablePoint mp1 = new MovablePoint(0, 0, 2, 3);
        @Test
        void moveUp() {
            mp1.moveUp();
            assertEquals(3, mp1.y);
        }

        @Test
        void moveDown() {
            mp1.moveUp();
            assertEquals(3, mp1.y);

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

        @Test
        void testToString() {
            mp1.toString();
        }

}
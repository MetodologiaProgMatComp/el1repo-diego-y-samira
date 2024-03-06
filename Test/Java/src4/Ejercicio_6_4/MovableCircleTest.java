package src4.Ejercicio_6_4;

import Ejercicio_6_4.MovableCircle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableCircleTest {

Ejercicio_6_4.MovableCircle mc1 = new MovableCircle(0,0,2,3,12);

    @Test
    void moveUp() {
        mc1.moveUp();
      //  assertEquals(3, mc1.y);
    }

    @Test
    void moveDown() {
        mc1.moveDown();
    }

    @Test
    void moveLeft() {

        mc1.moveLeft();
//        assertEquals(-3, mc1.x);
    }

    @Test
    void moveRight() {

        mc1.moveRight();
  //      assertEquals(3, mc1.x);
    }
}
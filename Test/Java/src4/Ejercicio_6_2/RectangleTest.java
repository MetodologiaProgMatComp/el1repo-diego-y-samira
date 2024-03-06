package src4.Ejercicio_6_2;

import Ejercicio_6_2.Rectangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    Rectangle r2 = new Rectangle(3,4);

    @Test
    void getArea() {
        assertEquals(12,r2.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(14,r2.getPerimeter());
    }

    @Test
    void testToString() {
        r2.toString();
    }
}
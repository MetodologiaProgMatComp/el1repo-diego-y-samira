package src4.Ejercicio_6_1;

import Ejercicio_6_1.Circle;
import Ejercicio_6_1.Shape;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {
Shape s1 = new Circle(1,"red", true);
    @Test
    void getColor() {
        assertEquals("red", s1.getColor());
    }

    @Test
    void setColor() {
    s1.setColor("Azul");
        assertEquals("Azul", s1.getColor());
    }

    @Test
    void isFilled() {
        assertEquals(true,s1.isFilled());
    }

    @Test
    void setFilled() {
        s1.setFilled(false);
        assertEquals(false,s1.isFilled());
    }

    @Test
    void getArea() {
    }

    @Test
    void getPerimeter() {
    }

    @Test
    void testToString() {
    }
}
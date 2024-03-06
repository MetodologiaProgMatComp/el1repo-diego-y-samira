package EjerciciosHerencias.Shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShapeTest {

    @Test
    void getColor() {
        // Test getColor method
        Shape shape = new Shape();
        shape.setColor("Red");
        assertEquals("Red", shape.getColor());
    }

    @Test
    void setColor() {
        // Test setColor method
        Shape shape = new Shape();
        shape.setColor("Blue");
        assertEquals("Blue", shape.getColor());
    }

    @Test
    void isFilled() {
        // Test isFilled method
        Shape shape = new Shape();
        shape.setFilled(true);
        assertTrue(shape.isFilled());
    }

    @Test
    void setFilled() {
        // Test setFilled method
        Shape shape = new Shape();
        shape.setFilled(false);
        assertFalse(shape.isFilled());
    }

    @Test
    void testToString() {
        // Test toString method
        Shape shape = new Shape();
        shape.toString();
    }
}

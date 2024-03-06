package EjerciciosHerencias.Shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void getArea() {
        // Test getArea method
        Rectangle rectangle = new Rectangle(5.0, 7.0); // Create a rectangle with width 5.0 and height 7.0
        assertEquals(35.0, rectangle.getArea(), 0.0001); // Check if the correct area is returned
    }

    @Test
    void getPerimeter() {
        // Test getPerimeter method
        Rectangle rectangle = new Rectangle(6.0, 8.0); // Create a rectangle with width 6.0 and height 8.0
        assertEquals(28.0, rectangle.getPerimeter(), 0.0001); // Check if the correct perimeter is returned
    }

    @Test
    void getWidth() {
        // Test getWidth method
        Rectangle rectangle = new Rectangle(4.0, 9.0); // Create a rectangle with width 4.0 and height 9.0
        assertEquals(4.0, rectangle.getWidth(), 0.0001); // Check if the correct width is returned
    }

    @Test
    void setWidth() {
        // Test setWidth method
        Rectangle rectangle = new Rectangle(6.0, 10.0); // Create a rectangle with width 6.0 and height 10.0
        rectangle.setWidth(12.0); // Set a new width
        assertEquals(12.0, rectangle.getWidth(), 0.0001); // Check if the width is updated correctly
    }

    @Test
    void getLength() {
        // Test getLength method
        Rectangle rectangle = new Rectangle(5.0, 11.0); // Create a rectangle with width 5.0 and height 11.0
        assertEquals(11.0, rectangle.getLength(), 0.0001); // Check if the correct length is returned
    }

    @Test
    void setLength() {
        // Test setLength method
        Rectangle rectangle = new Rectangle(7.0, 8.0); // Create a rectangle with width 7.0 and height 8.0
        rectangle.setLength(15.0); // Set a new length
        assertEquals(15.0, rectangle.getLength(), 0.0001); // Check if the length is updated correctly
    }

    @Test
    void testToString() {
    Rectangle rectangle = new Rectangle(6.0, 9.0); // Create a rectangle with width 6.0 and height 9.0
    rectangle.toString();
    }
}

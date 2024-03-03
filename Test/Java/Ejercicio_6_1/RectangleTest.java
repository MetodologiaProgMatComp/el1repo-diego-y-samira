package Ejercicio_6_1;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class RectangleTest {
    Rectangle rectangle=new Rectangle(3.0,4.0);
    Rectangle rectangle1=new Rectangle(2.0,3.0);
    @Test
    public void testGetArea() {
        assertEquals(12.0,rectangle.getArea());
    }
    @Test
    public void testGetPerimeter() {
        assertEquals(14.0,rectangle.getPerimeter());
    }
    @Test
    public void testGetWidth() {
        assertEquals(3.0,rectangle.getWidth());
    }
    @Test
    public void testSetWidth() {
        //Rectangle rectangle1=new Rectangle(2.0,3.0);
        rectangle1.setWidth(1.0);
        assertEquals(1.0,rectangle1.getWidth());
    }
    @Test
    public void testGetLength() {
        assertEquals(4.0,rectangle.getLength());
    }
    @Test
    public void testSetLength() {
        rectangle1.setLength(3.0);
        assertEquals(3.0,rectangle1.getLength());
    }
    @Test
    public void testTestToString() {
        assertEquals("rojo",rectangle.getColor());
        assertEquals(true,rectangle.isFilled());
    }
}
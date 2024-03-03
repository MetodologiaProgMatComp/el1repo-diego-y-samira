package Ejercicio_6_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CircleTest {
    Circle circle=new Circle(3.0);
    @Test
    public void testGetPerimeter() {
        assertEquals(3*2*Math.PI,circle.getPerimeter());
    }

    @Test
    public void testGetArea() {
        assertEquals(3*3*Math.PI,circle.getArea());
    }

    @Test
    public void testTestToString() {
        assertEquals("Circle[radius= 3.0]",circle.toString());
    }
}
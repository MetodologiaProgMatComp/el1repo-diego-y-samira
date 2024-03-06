package Ejercicio_6_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    Circle  circle=new Circle(3.0);
    @Test
    public void testGetArea() {
        assertEquals(Math.PI*3*3,circle.getArea(),0.01);
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(Math.PI*2*3,circle.getPerimeter());
    }

    @Test
    public void testTestToString() {
        assertEquals("Circle[radius= 3.0]",circle.toString());
    }
}
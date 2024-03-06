package Ejercicio_6_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    Circle circle=new Circle();
    Ejercicio_6_1.Circle c2 = new Ejercicio_6_1.Circle(2,"red",true);
    @Test
    public void testGetRadio() {
       assertEquals(2,c2.getRadio());
    }

    @Test
    public void testSetRadio() {
c2.setRadio(12);
        assertEquals(12,c2.getRadio());
    }

    @Test
    public void testGetArea() {
        assertEquals(Math.PI*4,c2.getArea());
    }

    @Test
    public void testGetPerimeter() {
        assertEquals(4*Math.PI,c2.getPerimeter());
    }

    @Test
    public void testTestToString() {
        c2.toString();
    }
}
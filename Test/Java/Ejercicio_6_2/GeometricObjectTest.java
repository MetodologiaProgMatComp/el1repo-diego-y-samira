package Ejercicio_6_2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GeometricObjectTest {
    GeometricObject geometricObject=new GeometricObject() {
        @Override
        public double getPerimeter() {
            return 0;
        }

        @Override
        public double getArea() {
            return 0;
        }
    };

    @Test
    public void testGetPerimeter() {
        assertEquals(0,geometricObject.getPerimeter());
    }

    @Test
    public void testGetArea() {
        assertEquals(0,geometricObject.getArea());
    }
}
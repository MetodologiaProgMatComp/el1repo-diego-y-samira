package src3.EjerciciosHerencias.Shape;

import EjerciciosHerencias.Shape.Circle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    Circle c1 = new Circle();
    Circle c2 = new Circle(12,"red",true);
    Circle c3 = new Circle(3);
    @Test
    void getRadio() {
        assertEquals(3,c3.getRadio());
    }

    @Test
    void setRadio() {
        c1.setRadio(12);
        assertEquals(12,c1.getRadio());
    }

    @Test
    void getArea() {
        assertEquals(9*Math.PI, c3.getArea());
    }

    @Test
    void getPerimeter() {
        assertEquals(6*Math.PI,c3.getPerimeter());
    }

    @Test
    void testToString() {
        c2.toString();
    }
}
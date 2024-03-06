package EjerciciosHerencias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {
    Circle c1 = new Circle();
    Circle c2 = new Circle(3);
    Circle c3 = new Circle(4,"red",true);
    @Test
    void getRadio() {
        assertEquals(c3.getRadio(),4);

    }

    @Test
    void setRadio() {
        c1.setRadio(12);
        assertEquals(c1.getRadio(),12);
    }

    @Test
    void getColor() {
        assertSame(c1.getColor(),"red");

    }

    @Test
    void setColor() {
        c2.setColor("Azul");

        assertSame(c2.getColor(),"Azul");
    }

    @Test
    void getArea() {
        assertEquals(c3.getArea(),c3.getRadio()*c3.getRadio()*Math.PI);

    }

    @Test
    void testToString() {
        c2.toString();
    }
}
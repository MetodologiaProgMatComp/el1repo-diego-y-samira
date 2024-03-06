package EjerciciosHerencias.puntos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point2DTest {
Point2D p1 = new Point2D();
Point2D p2 = new Point2D(5,10);
    @Test
    void getX() {
        assertEquals(p2.getX(),5);
    }

    @Test
    void setX() {
        p1.setX(12);
        assertEquals(p1.getX(),12);
    }

    @Test
    void getY() {
        assertEquals(p2.getY(),10);

    }

    @Test
    void setY() {
        p1.setY(20);
        assertEquals(p1.getY(),20);
    }
    @Test
    void getXY() {
        assertEquals(0, p1.getXY()[0]);

        assertEquals(0, p1.getXY()[1]);

    }
    @Test
    void setXY() {
        p1.setXY(20,25);
        assertEquals(p1.getX(),20);
        assertEquals(p1.getY(),25);

    }

}
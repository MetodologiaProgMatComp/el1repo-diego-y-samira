package EjerciciosHerencias;

import EjerciciosHerencias.puntos.Point2D;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class LineTest {
Line l1 = new Line(1,1,3,3);
Point2D p1 = new Point2D();
Point2D p2 = new Point2D(4,5);
Line l2 = new Line(p1,p2);

    @Test
    void getBegin() {
        assertEquals(p1,l2.getBegin());
    }

    @Test
    void setBegin() {
        Point2D p3 = new Point2D(6,7);
        l1.setBegin(p3);
        assertEquals(p3,l1.getBegin());
    }

    @Test
    void getEnd() {
        assertEquals(p2,l2.getEnd());
    }

    @Test
    void setEnd() {
        Point2D p3 = new Point2D(129,120);
        l2.setEnd(p3);
        assertEquals(p3,l2.getEnd());
    }

    @Test
    void getBeginX() {
        assertEquals(1,l1.getBeginX());
    }

    @Test
    void getBeginY() {

        assertEquals(1,l1.getBeginY());
    }

    @Test
    void getEndX() {

        assertEquals(3,l1.getEnd());
    }

    @Test
    void getEndY() {

        assertEquals(3,l1.getEndY());}

    @Test
    void getBeginXY() {
        assertEquals(1,l1.getBeginXY()[0]);
        assertEquals(1,l1.getBeginXY()[1]);

    }

    @Test
    void getEndXY() {
        assertEquals(3,l1.getEndXY()[0]);
        assertEquals(3,l1.getEndXY()[1]);

    }

    @Test
    void setBeginXY() {
        l1.setBeginXY(12,21);
        assertEquals(12,l1.getBeginXY()[0]);
        assertEquals(21,l1.getBeginXY()[1]);

    }

    @Test
    void setendXY() {
        l1.setendXY(30,300);
        assertEquals(30,l1.getEndXY()[0]);
        assertEquals(300,l1.getEndXY()[1]);
    }

    @Test
    void setBeginX() {
        l1.setBeginX(1212);
        assertEquals(1212,l1.getBeginX());

    }

    @Test
    void setBeginY() {
        l1.setBeginY(1212);
        assertEquals(1212,l1.getBeginY());

    }

    @Test
    void setEndX() {
        l1.setEndX(1212);
        assertEquals(1212,l1.getEndX());

    }

    @Test
    void setEndY() {
        l1.setEndY(1212);
        assertEquals(1212,l1.getEndY());

    }

    @Test
    void getLength() {
        l1.setBeginXY(3,2);
        assertEquals(1,l1.getLength());
    }

    @Test
    void getGradient() {
        Line l3 = new Line(12,123,13,124);
        assertEquals(Math.PI/4,l3.getGradient());
    }

}
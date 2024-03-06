package src2.Ejercicio2_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyPointTest {
    Ejercicio2_6.MyPoint p1 = new Ejercicio2_6.MyPoint(3,4);
    Ejercicio2_6.MyPoint p2 = new Ejercicio2_6.MyPoint();
    @Test
    void getX() {
        assertEquals(0,p2.getX());
    }

    @Test
    void setX() {
p2.setX(12);
        assertEquals(12,p2.getX());
    }

    @Test
    void getY() {
        assertEquals(4,p1.getY());
    }

    @Test
    void setY() {
p1.setY(40);
        assertEquals(40,p1.getY());
    }

    @Test
    void getXY() {


        assertEquals(3,p1.getXY()[0]);
        assertEquals(4,p1.getXY()[1]);
    }

    @Test
    void setXY() {

        p1.setXY(200,300);
        assertEquals(200,p1.getXY()[0]);
        assertEquals(300,p1.getXY()[1]);
    }

    //@Test
    //void toString() {
      //  p1.toString();
    //}

    @Test
    void distance() {
        assertEquals(5,p1.distance());
    }

    @Test
    void testDistance() {
        p2.setXY(3,6);
        assertEquals(2,p1.distance(p2));
    }

    @Test
    void testDistance1() {

        assertEquals(Math.sqrt(5),p1.distance(2,2));
    }
}
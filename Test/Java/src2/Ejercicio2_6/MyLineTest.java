package src2.Ejercicio2_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyLineTest {
    Ejercicio2_6.MyLine l1 = new Ejercicio2_6.MyLine(1,2,3,4);
    @Test
    void getBeginX() {
        assertEquals(1, l1.getBeginX());
    }

    @Test
    void setBeginX() {
        l1.setBeginX(12);
        assertEquals(12, l1.getBeginX());

    }

    @Test
    void getEndX() {

        assertEquals(3, l1.getEndX());

    }

    @Test
    void setEndX() {
        l1.setEndX(200);
        assertEquals(200, l1.getEndX());

    }

    @Test
    void getBeginY() {

        assertEquals(2, l1.getBeginY());

    }

    @Test
    void setBeginY() {
        l1.setBeginY(21);
        assertEquals(21, l1.getBeginY());
    }

    @Test
    void getEndY() {

        assertEquals(4, l1.getEndY());

    }

    @Test
    void setEndY() {
        l1.setEndY(420);
        assertEquals(420, l1.getEndY());
    }

    @Test
    void getBeginXY() {
        assertEquals(1,l1.getBeginXY()[0]);
        assertEquals(2,l1.getBeginXY()[1]);
    }

    @Test
    void setBeginXY() {
        l1.setBeginXY(new int[]{15, 21});
        assertEquals(15,l1.getBeginXY()[0]);
        assertEquals(21,l1.getBeginXY()[1]);

    }

    @Test
    void getEndXY() {

        assertEquals(3,l1.getEndXY()[0]);
        assertEquals(4,l1.getEndXY()[1]);
    }

    @Test
    void setEndXY() {

        l1.setEndXY(new int[]{200, 210});
        assertEquals(200,l1.getEndXY()[0]);
        assertEquals(210,l1.getEndXY()[1]);
    }

    @Test
    void getLength() {
        assertEquals(2*Math.sqrt(2),l1.getLength());
    }
}
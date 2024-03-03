import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BallTest {
    Ball ball=new Ball(4,1,1,3,3);
    @Test
    public void testGetVx() {
        assertEquals(1,ball.getVx());
    }
    @Test
    public void testGetVy() {
        assertEquals(1,ball.getVy());
    }
    @Test
    public void testGetX() {
        assertEquals(3,ball.getX());
    }
    @Test
    public void testGetY() {
        assertEquals(3,ball.getY());
    }
    @Test
    public void testGetRadio() {
        assertEquals(4,ball.getRadio());
    }
    @Test
    public void testSetRadio() {
        ball.setRadio(6);
        assertEquals(6,ball.getRadio());
    }
    @Test
    public void testSetVx() {
        ball.setVx(2);
        assertEquals(2,ball.getVx());
    }
    @Test
    public void testSetVy() {
        ball.setVy(2);
        assertEquals(2,ball.getVy());
    }
    @Test
    public void testSetX() {
        ball.setX(4);
        assertEquals(4,ball.getX());
    }
    @Test
    public void testSetY() {
        ball.setY(4);
        assertEquals(4,ball.getY());
    }
    @Test
    public void testMove() {
        ball.move();

        assertEquals(4,ball.getY());
        assertEquals(4,ball.getX());
    }
    @Test
    public void testHflip() {
        ball.hflip();
        assertEquals(-1,ball.getVy());
    }
    @Test
    public void testVflip() {
        ball.vflip();
        assertEquals(-2,ball.getVx());
    }
}
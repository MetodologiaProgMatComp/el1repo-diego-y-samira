package Ejercicio_6_5;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ResizableCircleTest {
    ResizableCircle resizableCircle=new ResizableCircle(3.0);
    @Test
    public void testgetRadius(){
        assertEquals(3.0,resizableCircle.getRadius());
    }
    @Test
    public void testTestToString() {
        assertEquals("ResizableCircle[Circle[radius= 3.0]",resizableCircle.toString());
    }

    @Test
    public void testResize() {
        ResizableCircle resizableCircle1=new ResizableCircle(4);
        resizableCircle1.resize(150);
        assertEquals(6,resizableCircle1.getRadius());
    }
}
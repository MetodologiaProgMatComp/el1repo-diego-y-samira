import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    Circle circle=new Circle(2,"Amarillo");
    Circle circle2 =new Circle();
    @Test
    public void testGetRadio() {
        assertEquals(2,circle.getRadio());
    }

    @Test
    public void testGetArea() {
        assertEquals(Math.PI*2*2,circle.getArea());
    }

    @Test
    public void testTestToString() {
        Circle circle=new Circle(2,"Amarillo");
        assertEquals("Circle[radius=2.0 , color=Amarillo]", circle.toString());
    }

    @Test
    public void testSetRadio() {
        circle.setRadio(4);
        assertEquals(4,circle.getRadio());
    }
}
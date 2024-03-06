package EjerciciosHerencias;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {
Cylinder c1 = new Cylinder();
Cylinder c2 = new Cylinder(3);
Cylinder c3 = new Cylinder(5,3,"Azul");
    @Test
    void getHeight() {

        assertEquals(c2.getHeight(),3);
    }

    @Test
    void setHeight() {
        c2.setHeight(1212);
        assertEquals(c2.getHeight(),1212);
    }

    @Test
    void getVolume() {
        assertEquals(c3.getVolume(),Math.PI*c3.getHeight()*c3.getRadio()*c3.getRadio());
    }

    @Test
    void testToString() {
        c3.toString();
    }
}
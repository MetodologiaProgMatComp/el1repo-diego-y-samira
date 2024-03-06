package EjerciciosHerencias.Cilindro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {


    Cylinder c1 = new Cylinder();

    Cylinder c2 = new Cylinder(2,3);

    Cylinder c3 = new Cylinder(4,5,"red", true);

    @Test
    void getHeight() {
        assertEquals(3,c2.getHeight());
    }

    @Test
    void setHeight() {
        c1.setHeight(2);
        assertEquals(2,c1.getHeight());
    }

    @Test
    void getVolumen() {
        assertEquals(c3.getHeight()*Math.PI*4*4 ,c3.getVolumen());
    }
}
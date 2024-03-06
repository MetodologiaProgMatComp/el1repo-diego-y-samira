package EjerciciosHerencias.puntos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Point3DTest {
    Point3D p3 = new Point3D();
    Point3D p4 = new Point3D(2, 3, 4);

    @Test
    void getZ() {
        assertEquals(p4.getZ(), 4);
    }

    @Test
    void setZ() {
        p3.setZ(12);
        assertEquals(p3.getZ(), 12);
    }

    @Test
    void setXYZ() {
        p3.setXYZ(9, 10, 11);
        assertEquals(p3.getX(), 9);
        assertEquals(p3.getY(), 10);
        assertEquals(p3.getZ(), 11);
    }

    @Test
    void getXYZ() {
        float[] coordenadas = p3.getXYZ();
        assertEquals(coordenadas[0], p3.getX());
        assertEquals(coordenadas[1], p3.getY());
        assertEquals(coordenadas[2] , p3.getZ());
    }
}
package EjerciciosHerencias.Shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SquareTest {

    Square cuadrado = new Square();
    @Test
    void setSide() {
        Square square = new Square(5.0);
        square.setSide(7.0);
        assertEquals(7.0, square.getSide(), 0.0001);
    }

    @Test
    void setWidth() {
        Square square = new Square(6.0);
        square.setWidth(8.0);
        assertEquals(8.0, square.getWidth(), 0.0001);
    }

    @Test
    void setLength() {
        Square square = new Square(12,"red",true);
        square.setLength(9.0);
        assertEquals(9.0, square.getLength(), 0.0001);
    }

    @Test
    void getSide() {
        Square square = new Square(5.0);
        assertEquals(5.0, square.getSide(), 0.0001);
    }

    @Test
    void testToString() {
        Square square = new Square(6.0);
        square.toString();
    }
}

package Ejercicio_6_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SquareTest {
    Ejercicio_6_1.Square s = new Ejercicio_6_1.Square();
    Square square= new Square(3.0);
    @Test
    public void testSetSide() {
        Square square1=new Square(4.0);
        square1.setSide(6.0);
        assertEquals(6.0,square1.getSide());
    }

    @Test
    public void testGetSide() {
        assertEquals(3.0,square.getSide());
    }

    @Test
    public void testToString() {
        Square square=new Square(5.0,"Azul",true);
        String esperado="Cuadrado[side= 5.0, color= Azul, filled= True]";
    }
}
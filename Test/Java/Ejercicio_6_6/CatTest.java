package Ejercicio_6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CatTest {
    Cat cat=new Cat("Marc");
    @Test
    public void testGreets() {
        cat.greets();

    }
}
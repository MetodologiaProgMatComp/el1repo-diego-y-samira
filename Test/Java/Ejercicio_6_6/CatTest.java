package Ejercicio_6_6;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CatTest {
    Cat cat=new Cat("Marc");
    @Test
    public void testGreets() {
        cat.greets();

    }
}
package Ejercicio_6_6;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BigDogTest {
    BigDog bigDog=new BigDog("Tara");
    @Test
    public void testGreets() {
        bigDog.greets();
    }

    @Test
    public void testGreets1() {
        BigDog anotherDog=new BigDog("Apolo");
        anotherDog.greets1(anotherDog);
    }

    @Test
    public void testTestGreets2() {
        BigDog anotherDog2=new BigDog("Luna");
        anotherDog2.greets2(anotherDog2);
    }
}
package Ejercicio_6_6;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DogTest {
    Dog dog=new Dog("Tara");
    @Test
    public void testGreets() {
        dog.greets();

    }

    @Test
    public void testTestGreets() {
        Dog anotherDog=new Dog("Apolo");
        anotherDog.greets1(anotherDog);
    }
}
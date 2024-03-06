package Ejercicio_6_6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
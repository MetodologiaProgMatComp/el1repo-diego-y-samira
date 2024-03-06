package Ejercicio_6_6;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Woof");
    }
    public void greets1(Dog another){
        System.out.println("Wooooooooooof");
    }
}

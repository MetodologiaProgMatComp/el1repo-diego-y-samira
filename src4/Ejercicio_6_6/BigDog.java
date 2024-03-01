package Ejercicio_6_6;

public class BigDog extends Dog{
    public BigDog(String name){
        super(name);
    }
    @Override
    public void greets(){
        System.out.println("Wooooowf");
    }
    @Override
    public void greets(Dog another){
        System.out.println("Wooooooooooowf");
    }
    public void greets(BigDog another){
        System.out.println("Woooooooooooooooowff");
    }
}

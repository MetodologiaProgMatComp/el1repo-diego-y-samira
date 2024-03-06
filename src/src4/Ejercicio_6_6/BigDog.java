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
    public void greets1(Dog another){
        System.out.println("Wooooooooooowf");
    }
    public void greets2(BigDog another){
        System.out.println("Woooooooooooooooowff");
    }
}

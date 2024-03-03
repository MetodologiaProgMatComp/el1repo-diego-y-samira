package Ejercicio_6_2;


public class Circle implements GeometricObject {
    private double radius;
    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        double x=Math.PI*radius*radius;
        return x;
    }
    @Override
    public double getPerimeter(){
        double y=Math.PI*2*radius;
        return y;
    }
    public String  toString(){
        return "Circle[radius= "+radius+"]";
    }
}

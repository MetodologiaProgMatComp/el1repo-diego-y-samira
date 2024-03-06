package Ejercicio_6_2;

public class Rectangle implements GeometricObject{
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    @Override
    public double getArea(){
        return this.length*this.width;
    }
    @Override
    public double getPerimeter(){
        return 2*this.width+2*this.length;
    }
    public String  toString(){
        return "Rectangle[raiuds="+width+", length="+length+"]";
    }
}

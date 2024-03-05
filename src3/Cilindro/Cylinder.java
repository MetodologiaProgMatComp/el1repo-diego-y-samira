package EjerciciosHerencias.Cilindro;

import EjerciciosHerencias.Circle;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(){
        this.base= new Circle();
        this.height = 1;
    }
    public Cylinder(double radio, double height){
        this.base= new Circle(radio);
        this.height = height;
    }
    public Cylinder(double radio, double height,String color, boolean b){
        this.base= new Circle(radio,color,b);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolumen(){
        return this.base.getArea()*this.height;

    }
}

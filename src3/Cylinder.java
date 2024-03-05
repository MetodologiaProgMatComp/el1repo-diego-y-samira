package EjerciciosHerencias;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        this.height = 1;

    }
    public Cylinder(double height){
        super();
        this.height = height;

    }
    public Cylinder(double radio, double height, String color){
        super(radio , color, false);
        this.height = height;
    }



    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getArea()*this.height;

    }
    @Override
    public String toString() {
        return super.toString()+"Height = "+height;
    }
}

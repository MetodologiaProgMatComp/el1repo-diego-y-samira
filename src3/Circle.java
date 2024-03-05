package EjerciciosHerencias;

    public class Circle {
    private double radio;
    private String color;

    public Circle() {
        this.radio = 1;
        this.color = "red";
    }
    public Circle(double radio){
        this.radio = radio;
        this.color = "red";
    }
    public Circle(double radio, String color, boolean b){
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return this.radio*radio*Math.PI;

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radio=" + radio +
                ", color='" + color + '\'' +
                '}';
    }
}

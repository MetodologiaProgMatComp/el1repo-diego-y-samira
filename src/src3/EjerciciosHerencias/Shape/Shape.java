package EjerciciosHerencias.Shape;

public class Shape {
protected String color;
protected boolean filled;

    public Shape(){
        color = "red";
        filled = true;

    }
    public Shape(String color, boolean filld){
        this.color = color;
        this.filled = filld;

    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}

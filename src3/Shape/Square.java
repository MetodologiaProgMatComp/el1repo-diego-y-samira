package EjerciciosHerencias.Shape;

public class Square extends Rectangle {

    public Square() {

    super();
}


public Square(double side){
        super(side,side);
}

public Square(double side, String color, Boolean filled){
        super(side, side,color, filled);
}

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(length);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(width);
    }

    public double getSide(){
        return this.length;
    }
    @Override
    public String toString() {
        return super.toString();
    }
}

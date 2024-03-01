package Ejercicio_6_4;

public abstract class MovableCircle extends MovablePoint implements Movable  {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}
    public String toString(){
        return "( x, y),speed= (x,y), radius="+ radius;
    }
}

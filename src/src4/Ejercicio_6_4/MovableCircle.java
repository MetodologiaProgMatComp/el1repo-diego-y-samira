package Ejercicio_6_4;

public class MovableCircle implements Movable  {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new Ejercicio_6_4.MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    public void moveUp(){
        this.center.moveUp();
    }
    public void moveDown(){
        this.center.moveDown();}
    public void moveLeft(){
        this.center.moveLeft();}
    public void moveRight(){this.center.moveRight();}
    public String toString(){
        return "( x, y),speed= (x,y), radius="+ radius;
    }
}

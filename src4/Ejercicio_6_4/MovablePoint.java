package Ejercicio_6_4;

import Ejercicio_6_3.Movable;

public abstract class MovablePoint implements Movable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void moveUp(){}
    public void moveDown(){}
    public void moveLeft(){}
    public void moveRight(){}
    public String toString(){
        return "( x, y),speed= (x,y), radius=";
    }
}

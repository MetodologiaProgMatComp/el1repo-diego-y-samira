package Ejercicio_6_4;

import Ejercicio_6_3.Movable;

public class MovablePoint implements Movable {
    int x;
     int y;
    private int xSpeed;
    private int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public void moveUp(){
        this.y+= this.ySpeed;
    }
    public void moveDown(){
        this.y-= this.ySpeed;}
    public void moveLeft(){
        this.x-= this.xSpeed;}
    public void moveRight(){this.x+= this.xSpeed;}
    public String toString(){
        return "( x, y),speed= (x,y), radius=";
    }
}

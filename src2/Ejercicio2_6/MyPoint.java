package Ejercicio2_6;

public class MyPoint {
    private int x;
    private int y;
    public MyPoint(){
        this(0,0);
    }
    public MyPoint(int  x, int y){
        this.x=x;
        this.y=y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public int[]  getXY(){
        return new int[]{x,y};
    }
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    public String ToString(){
        return "(" + x + " , " + y + ")" ;
    }
    public double distance(int x, int y){
        return Math.sqrt(Math.pow(this.x-x,2)+ Math.pow(this.y-y,2));
    }
    public double  distance(MyPoint other){
        return distance(other.x,other.y);
    }
    public double distance(){
        return distance(0, 0);
    }
}

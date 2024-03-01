package Ejercicio2_6;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;
    private MyPoint x;
    public MyLine(int x1,int y1, int x2, int y2){
        this.begin=new MyPoint(x1, y1);
        this.end=new MyPoint(x2, y2);
    }

   /* public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }*/
    public MyPoint getBeginX() {
        return begin;
    }

    public void setBeginX (MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEndX() {
        return end;
    }

    public void setEndX(MyPoint end) {
        this.end = end;
    }
    public MyPoint getBeginY() {
        return begin;
    }

    public void setBeginY(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEndY() {
        return end;
    }

    public void setEndY(MyPoint end) {
        this.end = end;
    }
    public int[] getBeginXY(){
        int[] xy=new int[2];
        xy[0]=begin.getX();
        xy[1]=begin.getY();
        return xy;
    }
    public void setBeginXY(int[] xy){
        begin.setX(xy[0]);
        begin.setY(xy[1]);
    }
    public int[] getEndXY(){
        int[] xy=new int[2];
        xy[0]=end.getX();
        xy[1]=end.getY();
        return xy;
    }
    public void setEndXY(int[] xy){
        end.setX(xy[0]);
        end.setY(xy[1]);
    }
    public double getLength(){
        return begin.distance(end);
    }
}

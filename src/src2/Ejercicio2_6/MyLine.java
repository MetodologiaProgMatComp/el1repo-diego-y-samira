package Ejercicio2_6;

public class MyLine {
    private Ejercicio2_6.MyPoint begin;
    private Ejercicio2_6.MyPoint end;
    private Ejercicio2_6.MyPoint x;
    public MyLine(int x1,int y1, int x2, int y2){
        this.begin=new Ejercicio2_6.MyPoint(x1, y1);
        this.end=new Ejercicio2_6.MyPoint(x2, y2);
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
    public int getBeginX() {
        return begin.getX();
    }

    public void setBeginX (int begin) {
        this.begin.setX(begin);
    }

    public int getEndX() {
        return end.getX();
    }

    public void setEndX(int end) {
        this.end.setX(end);
    }
    public int getBeginY() {
        return begin.getY();
    }

    public void setBeginY(int begin) {
        this.begin.setY(begin);
    }

    public int getEndY() {
        return end.getY();
    }

    public void setEndY(int end) {
        this.end.setY(end);
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

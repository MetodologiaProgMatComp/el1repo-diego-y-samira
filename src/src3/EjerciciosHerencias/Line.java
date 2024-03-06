package EjerciciosHerencias;

import EjerciciosHerencias.puntos.Point2D;

public class Line {
    private Point2D begin;
    private Point2D end;

    public Line(Point2D begin, Point2D end){
        this.begin = begin;
        this.end = end;
    }


    public Line(float beginX, float beginY, float endX, float endY){
        this.begin= new Point2D(beginX,beginY);
         this.end = new Point2D(endX,endY);
            }

    public Point2D getBegin() {
        return this.begin;
    }

    public void setBegin(Point2D begin) {
        this.begin = begin;
    }

    public Point2D getEnd() {
        return this.end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }
    public float getBeginX(){
        return this.begin.getX();
    }
    public float getBeginY(){
        return this.begin.getY();
    }
    public float getEndX(){
        return this.end.getX();
    }
    public float getEndY(){
        return this.end.getY();
    }
















    public float[] getBeginXY(){
        return this.begin.getXY();
    }
    public float[] getEndXY(){
        return this.end.getXY();
    }
    public void setBeginXY(float x, float y){
        this.begin.setXY(x,y);
    }
    public void setendXY(float x, float y){
        this.end.setXY(x,y);
    }

    public void setBeginX(float x){
        this.begin.setX(x);
    }
    public void setBeginY(float y){
        this.begin.setY(y);
    }
    public void setEndX(float x){
        this.end.setX(x);
    }
    public void setEndY(float y){
        this.end.setY(y);
    }

    public double getLength(){
        return Math.sqrt((this.begin.getX()-this.end.getX())*(this.begin.getX()-this.end.getX()) + (this.begin.getY()-this.end.getY())*(this.begin.getY()-this.end.getY()));
    }

    public double getGradient(){
        return Math.atan2 (this.end.getY()-this.begin.getY(),this.end.getX()-this.begin.getX() );
    }





}

package EjerciciosHerencias.puntos;

public class MovablePoint extends Point2D{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float xSpeed, float ySpeed) {
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
        super();
        xSpeed = 1;
        ySpeed = 1;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float x, float y){
        setxSpeed(x);
        setySpeed(y);
    }
    public float[] getSpeed(){
        float[] Speed = new float[2];
        Speed[0] = getxSpeed();
        Speed[1] = getySpeed();
        return Speed;
    }
}

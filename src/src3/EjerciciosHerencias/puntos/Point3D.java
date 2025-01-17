package EjerciciosHerencias.puntos;

public class Point3D extends Point2D{
    private float z;
    public Point3D(float x,float y, float z ){
        super(x,y);
        this.z = z;


    }
    public Point3D(){
        super();
        this.z = 0;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ(){
        float[] coordenadas = new float[3];
        coordenadas[0] = getX();
        coordenadas[1] = getY();
        coordenadas[2] = getZ();
        return coordenadas;
    }
}

package src1;

public class Rectangle {
    private float lado = 1f;
    private float ancho = 1f;

    void Rectanble(){
        this.ancho = 1f;
        this.lado = 1f;
    }
    void Rectanble(float a, float l){
        this.ancho = a;
        this.lado = l;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    public float getAncho() {
        return ancho;
    }

    public void setAncho(float ancho) {
        this.ancho = ancho;
    }
    public float getArea(){
        return this.ancho*this.lado;

    }
    public float getPerimeter(){
        return 2*this.ancho+2*this.lado;

    }
}

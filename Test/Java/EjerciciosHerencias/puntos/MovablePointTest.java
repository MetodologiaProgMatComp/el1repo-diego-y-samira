package EjerciciosHerencias.puntos;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovablePointTest {
    MovablePoint mP1 = new MovablePoint();
    MovablePoint mP2 = new MovablePoint(2,2);
    MovablePoint mP3 = new MovablePoint(3,4,5,6);
    @Test
    void getxSpeed() {
        assertSame(mP1.getxSpeed(), 1);
    }

    @Test
    void setxSpeed() {
        mP1.setxSpeed(12);
        assertSame(12.0,mP1.getxSpeed());

    }

    @Test
    void getySpeed() {


        assertSame(mP2.getySpeed(),2);

    }

    @Test
    void setySpeed() {
        mP3.setySpeed(1212);
        assertSame((int)mP3.getySpeed(), 1212);
    }


    @Test
    void setSpeed() {
        mP3.setSpeed(1,4);
    }

    @Test
    void getSpeed() {
        mP2.getSpeed();
    }
}
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {
    Time time=new Time(6,30,23);
    @Test
    public void testGetHour() {
        assertEquals(6,time.getHour());
    }

    @Test
    public void testSetHour() {
        time.setHour(4);
        assertEquals(4,time.getHour());
    }

    @Test
    public void testGetMinute() {
        assertEquals(30,time.getMinute());
    }

    @Test
    public void testSetMinute() {
        time.setMinute(45);
        assertEquals(45,time.getMinute());
    }

    @Test
    public void testGetSecond() {
        assertEquals(23,time.getSecond());
    }

    @Test
    public void testSetSecond() {
        time.setSecond(2);
        assertEquals(2,time.getSecond());
    }

    @Test
    public void testSetTime() {
        Time time1=new Time(0,0,0);
        time1.setTime(3,50,22);
        assertEquals(3,time1.getHour());
        assertEquals(50,time1.getMinute());
        assertEquals(22,time1.getSecond());
    }

    @Test
    public void testTestToString() {
        Time time=new Time(6,30,23);
        assertEquals("06//30//23",time.toString());
    }

    @Test
    public void testNextSecond() {
        Time time = new Time(23, 59, 59);
        time.nextSecond();
        assertEquals("00//00//00", time.toString());
    }

    @Test
    public void testPreviousSecond() {
        Time time=new Time(00,00,00);
        time.previousSecond();
        assertEquals("23//59//59",time.toString());

    }
}
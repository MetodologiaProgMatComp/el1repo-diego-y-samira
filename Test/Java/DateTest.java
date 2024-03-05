import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DateTest {
    Date date=new Date(2,3,2024);

    @Test
    public void testGetDay() {
        assertEquals(2,date.getDay());
    }

    @Test
    public void testGetMonth() {
        assertEquals(3,date.getMonth());
    }

    @Test
    public void testGetYear() {
        assertEquals(2024,date.getYear());
    }
    @Test
    public void testSetDay() {
        date.setDay(4);
        assertEquals(4,date.getDay());
    }
    @Test
    public void testSetMonth() {
        date.setMonth(5);
        assertEquals(5,date.getMonth());
    }
    @Test
    public void testSetYear() {
        date.setYear(1998);
        assertEquals(1998,date.getYear());
    }
    @Test
    public void testSetDate() {
        //Date date2=new Date(2,12,2023);
        date.setDate(2,12,2023);
        assertEquals(2,date.getDay());
        assertEquals(12,date.getMonth());
        assertEquals(2023,date.getYear());


    }
    @Test
    public void testTestToString() {
        Date date1=new Date(2,12,2023);
        assertEquals("02//12//2023",date1.toString());
    }
}
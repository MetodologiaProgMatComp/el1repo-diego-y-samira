package EjerciciosHerencias.Personas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    Staff s1 = new Staff("Antonio", "Guada", "UAH", 2000);
    @Test
    void getSchool() {
        assertEquals("UAH",s1.getSchool());
    }

    @Test
    void setSchool() {
        s1.setSchool("URJC");
        assertEquals("URJC",s1.getSchool());

    }

    @Test
    void getPay() {

        assertEquals(2000,s1.getPay());

    }

    @Test
    void setPay() {
        s1.setPay(3000);
        assertEquals(3000,s1.getPay());

    }

    @Test
    void testToString() {
        s1.toString();
    }
}














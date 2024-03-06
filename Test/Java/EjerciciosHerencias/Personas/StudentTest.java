import EjerciciosHerencias.Personas.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    Student st1 = new Student("Diego", "Guadalajara", "MatyComp", 1, 18);

    @Test
    void getProgram() {
        assertEquals("MatyComp", st1.getProgram());
    }

    @Test
    void setProgram() {
        st1.setProgram("Grado2");
        assertEquals("Grado2", st1.getProgram());
    }

    @Test
    void getYear() {
        assertEquals(1, st1.getYear());
    }

    @Test
    void setYear() {
        st1.setYear(2);
        assertEquals(2, st1.getYear());
    }

    @Test
    void getFee() {
        assertEquals(18, st1.getFee());
    }

    @Test
    void setFee() {
        st1.setFee(800);
        assertEquals(800, st1.getFee());
    }
}
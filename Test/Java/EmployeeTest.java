import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class EmployeeTest {
    Employee employee=new Employee(34,"Maria","Lora",1310);
    @Test
    public void testGetId() {
        assertEquals(34,employee.getId());
    }

    @Test
    public void testGetFirstName() {;
        assertEquals("Maria",employee.getFirstName());
    }

    @Test
    public void testGetSalary() {;
        assertEquals(1310,employee.getSalary());
    }

    @Test
    public void testGetAnualSalary() {
        assertEquals(employee.getSalary()*12,employee.getAnualSalary());
    }

    @Test
    public void testGetLastName() {;
        assertEquals("Lora",employee.getLastName());
    }

    @Test
    public void testSetSalary() {
        employee.setSalary(1300);
        assertEquals(1300,employee.getSalary());
    }

    @Test
    public void testRaiseSalary() {
        int newSalary= employee.raiseSalary(10);
        assertEquals(1441,newSalary);

    }

    @Test
    public void testTestToString() {
        Employee employee1=new Employee(99,"Carlos","López",1780);
        assertEquals("[Employee[id= 99, name= Carlos, López, salary= 1780]",employee1.toString());
    }
}
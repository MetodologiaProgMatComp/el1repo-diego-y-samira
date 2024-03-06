package src2.Ejercicio2_5;

import Ejercicio2_5.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {


    Ejercicio2_5.Customer c1 = new Ejercicio2_5.Customer(12345,"Ramón", 'M');
    Ejercicio2_5.Account a1 = new Account(123456,c1,5000);
    Ejercicio2_5.Customer c2 = new Ejercicio2_5.Customer(12345678,"Laura", 'F');
    Ejercicio2_5.Account a2 = new Account(123,c2,5500);
    Ejercicio2_5.Account a3 = new Account(123,c2);


    @Test
    void getId() {
        assertEquals(123456,a1.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(c1,a1.getCustomer());
    }

    @Test
    void getBalance() {
        assertEquals(5000,a1.getBalance());
    }

    @Test
    void setBalance() {
        a1.setBalance(6000);
        assertEquals(6000,a1.getBalance());
    }

    @Test
    void testToString() {
        a1.toString();
    }

    @Test
    void getCustomerName() {
        assertEquals("Laura", a2.getCustomerName());
    }

    @Test
    void deposit() {
        a1.deposit(500);
        assertEquals(5500,a1.getBalance());
    }

    @Test
    void withdraw() {
        a2.withdraw(500);
        assertEquals(5000,a2.getBalance());
    }
}
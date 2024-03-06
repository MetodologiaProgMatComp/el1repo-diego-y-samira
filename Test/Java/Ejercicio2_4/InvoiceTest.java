package src2.Ejercicio2_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {

Ejercicio2_4.Customer c1= new Ejercicio2_4.Customer(18034751,"Nombre1",4);
Ejercicio2_4.Invoice i1 = new Ejercicio2_4.Invoice(12345678,c1,300);
    @Test
    void getId() {
        assertEquals(12345678,i1.getId());
    }

    @Test
    void getCustomer() {
        assertEquals(c1,i1.getCustomer());
    }

    @Test
    void setCustomer() {
        Ejercicio2_4.Customer c2 = new Ejercicio2_4.Customer(876543,"Perez",20);
        i1.setCustomer(c2);
        assertEquals(c2,i1.getCustomer());
    }

    @Test
    void getAmount() {
        assertEquals(300,i1.getAmount());
    }

    @Test
    void setAmount() {
        i1.setAmount(2000);
        assertEquals(2000,i1.getAmount());
    }

    @Test
    void getCustomerId() {
        assertEquals(18034751,i1.getCustomerId());
    }

    @Test
    void getCustomerName() {

        assertEquals("Nombre1",i1.getCustomerName());
    }

    @Test
    void getCustomerDiscount() {

        assertEquals(4,i1.getCustomerDiscount());
    }

    @Test
    void getAmountAfterDiscount() {
        assertEquals(288,i1.getAmountAfterDiscount());
    }

    @Test
    void testToString() {
        i1.toString();
    }
}
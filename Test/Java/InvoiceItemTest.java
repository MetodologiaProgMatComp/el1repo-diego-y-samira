import org.testng.annotations.Test;

import java.util.Optional;

import static org.testng.Assert.*;

public class InvoiceItemTest {
    InvoiceItem invoiceItem= new InvoiceItem("210-c","Camisetas",50,14.99);
    @Test
    public void testGetId() {
        assertEquals("210-c",invoiceItem.getId());
    }

    @Test
    public void testGetDesc() {
        assertEquals("Camisetas",invoiceItem.getDesc());
    }

    @Test
    public void testGetQty() {
        assertEquals(50,invoiceItem.getQty(),0.01);
    }

    @Test
    public void testGetUnitPrice() {
        assertEquals(14.99,invoiceItem.getUnitPrice(),0.0001);
    }

    @Test
    public void testSetQty() {
        invoiceItem.setQty(25);
        assertEquals(25,invoiceItem.getQty(),0.01);
    }

    @Test
    public void testSetUnitPrice() {
        invoiceItem.setUnitPrice(12.00);
        assertEquals(12.00,invoiceItem.getUnitPrice(),0.1);
    }

    @Test
    public void testGetTotal() {
        assertEquals(749.5,invoiceItem.getTotal(),0.5);

    }

    @Test
    public void testTestToString() {
        InvoiceItem invoiceItem= new InvoiceItem("210-c","Camisetas",50,14.99);
        assertEquals("InvoiceItem[id= 210-c, desc= Camisetas, qty= 50 unitPrice= 14.99]",invoiceItem.toString());
    }
}
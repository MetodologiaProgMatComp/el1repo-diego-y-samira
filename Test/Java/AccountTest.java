import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    Account account=new Account("999szg","Sara Gonzalez", 100);
    Account account2=new Account("999szg","Sara Gonzalez");

    @Test
    public void testGetId() {
        String id= account.getId();
        assertEquals("999szg",id);

    }

    @Test
    public void testGetName() {
        String name=account.getName();
        assertEquals("Sara Gonzalez",name);

    }

    @Test
    public void testGetBalance() {
        assertEquals(100,account.getBalance());
    }

    @Test
    public void testCredit() {
        assertEquals(100,account.credit(-50));
       // assertEquals(100,account.credit(150));
    }

    @Test
    public void testDebit() {
        assertEquals(100,account.debit(150));
        //        assertEquals(100,account.debit(50));
        // assertEquals(100,account.debit(-10));
    }

    @Test
    public void testTransferTo() {
        Account otherAccount=new Account("111abz","José García",75);
        otherAccount.transferTo(account,20);
        otherAccount.transferTo(account,-20);
        //assertEquals(80,account.getBalance());
        assertEquals(55,otherAccount.getBalance());
    }

    @Test
    public void testTestToString() {

        assertEquals("Account[id= "+ "999szg" +" ,name= "+ "Sara Gonzalez"+ " ,balance= " +100+ "]", account.toString());
    }
}
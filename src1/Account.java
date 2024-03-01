package Practica_1;

public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account (String id, String name){
        this.id= id;
        this.name= name;
    }
    public Account (String id, String name, int balance){
        this.id= id;
        this.name= name;
        this.balance=balance;
    }
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(double amount){
        if(amount >0){
            balance+= amount;
        }else {
            System.out.println("Cantidad inapropiada. Inntroduzca una cantidad positiva.");
        }
        return balance;
    }
    public int debit(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Cantidad excesiva");
        }
        return balance;
    }
    public void transferTo(Account other, int amount){
    if(amount>0 && amount <=balance){
        debit(amount);
        other.credit(amount);
    }else{
        System.out.println("Cantidad en exceso.");
    }
    }
    public String toString(){
        return "Account[id= "+ id +" ,name= "+ name+ " ,balance= " +balance+ "]";
    }
}
package Ejercicio2_5;

public class Account {
    private int id;
    private Customer customer;
    private double balance=0.0;
    private double balan;
    public Account(int id,Customer customer,double balance){
        this.id=id;
        this.customer=customer;
        this.balance=balance;
    }
    public Account(int id,Customer customer){
        this.id=id;
        this.customer=customer;
        this.balance = 0;
    }

    public int getId() {
        return id;
    }


    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String toString(){
        double balan=Math.round(balance*100)/100;
        return "Account[id= "+ id +" ,name= "+ ", balance=" +balan+ "]";
    }
    public String getCustomerName(){
        return customer.getName();
    }
    public double deposit(double amount){
        if (amount>0){
            balance+=amount;
        }else{
            System.out.println("Cantidad negativa, intorduzca números positivos");
        }
        return balance;
    }
    public double withdraw(double amount){
        if(balance>=amount){
            balance -=amount;
        }else{
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return balance;
    }
}

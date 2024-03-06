package Ejercicio2_2;

public class Book {
    private String name;
    private Author[] autores;
    private double price;
    int qty;


    public Book(String name, Author[] autores, double price){
        this.price = price;
        this.name = name;
        this.autores = autores;
        this.qty = 0;
    }
    public Book(String name, Author[] autores, double price, int qty){
        this.price = price;
        this.name = name;
        this.autores = autores;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Author[] getAutores() {
        return autores;
    }

    public String getAuthorNames(){
        String a = "";
        int i = 0;
        while (autores[i]!= null){
        a+=","+ autores[i].getName();
        i++;}
        
    return a;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

package Practica_1;

public class InvoiceItem {
    private String id;
    private String desc;
    private Integer qty;
    private Double unitPrice;

    public InvoiceItem (String id ,String desc ,Integer qty,Double unitPrice){
        this.id= id;
        this.desc= desc;
        this.qty= qty;
        this.unitPrice= unitPrice;

    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public Integer getQty() {
        return qty;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Double getTotal(){
        return unitPrice*qty;
    }
    public String toString(){
        return "InvoiceItem[id= " + id + ", desc= "+desc+", qty= "+ qty+  " unitPrice= "+ unitPrice +"]";
    }

}

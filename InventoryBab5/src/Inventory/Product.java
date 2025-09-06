package Inventory;

public class Product {

    private int itemNumber;
    private String itemName;
    private int itemAvaibility;
    private double unitPrice;
    private boolean active = true;


    public Product() {
        this.itemNumber = 0;
        this.itemName = "Unknown";
        this.itemAvaibility = 0;
        this.unitPrice = 0;
    }

    public Product(int itemNumber,String itemName,int itemAvaibility,double unitPrice) {
        this.itemNumber = itemNumber;
        this.itemName = itemName;
        this.itemAvaibility = itemAvaibility;
        this.unitPrice = unitPrice;
    }

    public int getitemNumber(){
        return  itemNumber;
    }

    public void setitemNumber(int itemNumber){
        this.itemNumber = itemNumber;
    }

    public String getitemName(){
        return  itemName;
    }

    public void setitemName(String itemName){
        this.itemName = itemName;
    }

    public int getitemAvability(){
        return  itemAvaibility;
    }

    public void setitemAvability(int itemAvaibility){
        this.itemAvaibility = itemAvaibility;
    }

    public double getunitPrice(){
        return  unitPrice;
    }

    public void setunitPrice(int unitPrice){
        this.unitPrice = unitPrice;
    }

    public boolean isActive(){
        return active;
    }

    public void setActive(boolean active){
        this.active = active;
    }

    public double getInventoyvalue(){
        return itemAvaibility * unitPrice;
    }

    @Override
    public String toString() {
        String Status = active ? "Active" : "Not Active";
        return "Item Number : " + itemNumber +
               "\nItem Name : " + itemName +
               "\nItem Avaiblity : " + itemAvaibility +
               "\nItem Price : " + unitPrice +
               "\nInventory Value : " + getInventoyvalue() +
               "\nProduct Status : " + Status;
    }

}

package inventory;

public class Product {

    //Intance field declaration
    private int nomorItem;
    private String namaItem;
    private int jumlahItem;
    private int hargaItem;

    public Product() {
    }

    public Product(int number, String name, int qty, int price) {
        this.nomorItem = number;
        this.namaItem = name;
        this.jumlahItem = qty;
        this.hargaItem = price;
    }
// --- Getters (accessors) ---
    // return item number

    public int getnomorItem() {
        return nomorItem;
    }

    // return product name
    public String getnamaItem() {
        return namaItem;
    }

    // return available units
    public int getjumlahItem() {
        return jumlahItem;
    }

    // return unit price
    public double gethargaItem() {
        return hargaItem;
    }

    // --- Setters (mutators) ---
    // set item number
    public void setItemNumber(int nomorItem) {
        this.nomorItem = nomorItem;
    }

    // set product name
    public void setProductName(String namaItem) {
        this.namaItem = namaItem;
    }

    // set available units
    public void setUnitsAvailable(int jumlahItem) {
        this.jumlahItem = jumlahItem;
    }

    // set unit price
    public void setUnitPrice(int hargaItem) {
        this.hargaItem = hargaItem;
    }

    // String representation of a Product
    @Override
    public String toString() {
        return "Item Number : " + nomorItem + "\n"
                + "Name : " + namaItem + "\n"
                + "Quantity in stock: " + jumlahItem + "\n"
                + "Price : " + hargaItem;
    }
}

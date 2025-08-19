package inventory;

public class ProductTester {
    
    public static void main(String[] args) {
        Product p1 = new Product();
        p1.setItemNumber(100);
        p1.setProductName("BUKU");
        p1.setUnitPrice(1);
        p1.setUnitsAvailable(1);
        
        Product p2 = new Product();
        p2.setItemNumber(101);
        p2.setProductName("BUKU MTK");
        p2.setUnitPrice(100);
        p2.setUnitsAvailable(1);
        
        Product p3 = new Product(102, "BUKU INGGRIS", 50, 25000);
        Product p4 = new Product(103, "BUKU INDONESIA", 50, 25000);
        Product p5 = new Product(104, "BUKU SEJARAH", 50, 25000);
        Product p6 = new Product(105, "BUKU PKN", 50, 25000);
        
        Product[] Products = {p1, p2, p3, p4, p5, p6};
        
        System.out.println("===Daftar Produk===/n");
        for (Product p : Products) {
            System.out.println(p);
            System.out.println();
        }
        
    }
    
}

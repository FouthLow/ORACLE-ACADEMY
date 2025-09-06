package Inventory;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProductTester {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);

        int maxSize = -1;
        
        do {
            try {
                System.out.println("Masukan Jumlah Yang Ingin Anda Tambahkan");
                System.out.println("Masukan 0 (nol) Jika Anda Tidak Ingin Menambahkan Produk");
                maxSize = in.nextInt();

                if (maxSize < 0 ) {
                    System.out.println("Nilai Salah Dimasukan\n");
                }

            } catch (InputMismatchException e) {
                System.out.println("Incorrect Data Type Entered!");
                in.nextLine();
            }
        } while (maxSize < 0);
          in.nextLine();
          
        if (maxSize == 0) {
            System.out.println("No Product Required!");
        } else {
            Product[] products = new Product[maxSize];

            for (int i = 0; i < maxSize; i++) {

                System.out.println("\nEnter Product " + (i + 1) + " Data");

                System.out.print("Item Number : ");
                int itemNumber = in.nextInt();
                in.nextLine();

                System.out.print("Item Name : ");
                String itemName = in.nextLine();

                System.out.print("Item Avaiblility : ");
                int itemAvaibility = in.nextInt();
            
                System.out.print("Item price : ");
                Double unitPrice = in.nextDouble();
            
                products[i] = new Product(itemNumber,itemName,itemAvaibility,unitPrice);
            }

            System.out.println("\n====== All Product ======");
            for (Product p : products) {
                System.out.println(p);
                System.out.println("------------------------");
            }
        }
        in.close();
    }
}

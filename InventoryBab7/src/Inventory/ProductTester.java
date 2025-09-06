package Inventory;
 
import java.util.Scanner;

public class ProductTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int maxSize, menuChoice;

        maxSize = getNumProducts(in);
        if (maxSize <= 0) {
            System.out.println("No products required!");
        } else {
            Product[] products = new Product[maxSize];

            for (int i = 0; i < maxSize; i++) {
                addInventory(products, in, i);
            }

            do {
                menuChoice = getMenuOption(in);
                executeMenuChoice(menuChoice, products, in);
            } while (menuChoice != 0);
        }
        in.close();
    }

    // --- MENU ---
    public static int getMenuOption(Scanner in) {
        int choice = -1;
        while (choice < 0 || choice > 4) {
            System.out.println("\nMenu:");
            System.out.println("1. Lihat Inventaris");
            System.out.println("2. Tambah Persediaan");
            System.out.println("3. Kurangi Persediaan");
            System.out.println("4. Hentikan Produk");
            System.out.println("0. Keluar");
            System.out.print("Masukkan opsi menu: ");
            if (in.hasNextInt()) {
                choice = in.nextInt();
            } else {
                in.next(); // buang input salah
                choice = -1;
            }
        }
        return choice;
    }

    public static void executeMenuChoice(int menuChoice, Product[] products, Scanner in) {
        switch (menuChoice) {
            case 1:
                System.out.println("\n--- Lihat Daftar Produk ---");
                displayInventory(products);
                break;
            case 2:
                System.out.println("\n--- Tambah Persediaan ---");
                addInventoryToProduct(products, in);
                break;
            case 3:
                System.out.println("\n--- Kurangi Persediaan ---");
                deductInventory(products, in);
                break;
            case 4:
                System.out.println("\n--- Hentikan Persediaan ---");
                discontinueInventory(products, in);
                break;
            case 0:
                System.out.println("Keluar...");
                break;
        }
    }

    // --- INVENTORY ---
    public static void displayInventory(Product[] products) {
        for (int i = 0; i < products.length; i++) {
            if (products[i] != null) {
                System.out.println("\nIndex " + i + ":");
                System.out.println(products[i].toString());
            }
        }
    }

    public static void addInventory(Product[] products, Scanner in, int i) {
        int stockChoice = -1;
        while (stockChoice < 1 || stockChoice > 2) {
            System.out.println("1: CD");
            System.out.println("2: DVD");
            System.out.print("Masukkan tipe produk: ");
            System.out.flush();
            stockChoice = in.nextInt();
            if (stockChoice < 1 || stockChoice > 2) {
                System.out.println("Hanya angka 1 atau 2 yang diperbolehkan!");
            }
        }
        if (stockChoice == 1) {
            addCDToInventory(products, in, i);
        } else {
            addDVDToInventory(products, in, i);
        }
    }

    public static void addCDToInventory(Product[] products, Scanner in, int i) {
        in.nextLine(); // buffer
        System.out.println("Masukkan nama CD:");
        String name = in.nextLine();
        System.out.println("Masukkan nama artis:");
        String artist = in.nextLine();
        System.out.println("Masukkan nama label rekaman:");
        String label = in.nextLine();
        System.out.println("Masukkan jumlah lagu:");
        int numSongs = in.nextInt();
        System.out.println("Masukkan jumlah persediaan untuk produk ini:");
        int qty = in.nextInt();
        System.out.println("Masukkan harga untuk produk ini:");
        double price = in.nextDouble();
        System.out.println("Masukkan nomor item:");
        int number = in.nextInt();

        products[i] = new CD(number, name, qty, price, artist, numSongs, label);
    }

    public static void addDVDToInventory(Product[] products, Scanner in, int i) {
        in.nextLine(); // buffer
        System.out.println("Masukkan nama DVD:");
        String name = in.nextLine();
        System.out.println("Masukkan nama studio film:");
        String studio = in.nextLine();
        System.out.println("Masukkan nilai usia:");
        int ageRating = in.nextInt();
        System.out.println("Masukkan durasi dalam menit:");
        int duration = in.nextInt();
        System.out.println("Masukkan jumlah persediaan untuk produk ini:");
        int qty = in.nextInt();
        System.out.println("Masukkan harga untuk produk ini:");
        double price = in.nextDouble();
        System.out.println("Masukkan nomor item:");
        int number = in.nextInt();

        products[i] = new DVD(number, name, qty, price, duration, ageRating, studio);
    }

    // --- MODIFY STOCK ---
    public static int getProductNumber(Product[] products, Scanner in) {
        int productChoice = -1;
        while (productChoice < 0 || productChoice >= products.length) {
            System.out.println("Pilih produk:");
            for (int i = 0; i < products.length; i++) {
                if (products[i] != null) {
                    System.out.println(i + ": " + products[i].getitemName());
                }
            }
            System.out.print("Masukkan nomor produk: ");
            if (in.hasNextInt()) {
                productChoice = in.nextInt();
            } else {
                in.next(); // buang input salah
                productChoice = -1;
            }
        }
        return productChoice;
    }

    public static void addInventoryToProduct(Product[] products, Scanner in) {
        int productChoice = getProductNumber(products, in);
        System.out.print("Berapa banyak yang ingin ditambahkan? ");
        int updateValue = in.nextInt();
        if (updateValue >= 0) {
            products[productChoice].addToInventory(updateValue);
        } else {
            System.out.println("Nilai harus >= 0");
        }
    }

    public static void deductInventory(Product[] products, Scanner in) {
        int productChoice = getProductNumber(products, in);
        System.out.print("Berapa banyak yang ingin dikurangi? ");
        int updateValue = in.nextInt();
        if (updateValue >= 0 && updateValue <= products[productChoice].getitemAvability()) {
            products[productChoice].deductFromInventory(updateValue);
        } else {
            System.out.println("Nilai tidak valid!");
        }
    }

    public static void discontinueInventory(Product[] products, Scanner in) {
        int productChoice = getProductNumber(products, in);
        products[productChoice].setActive(false);
        System.out.println("Produk " + products[productChoice].getitemName() + " dihentikan.");
    }

    // --- GET NUMBER OF PRODUCTS ---
    public static int getNumProducts(Scanner in) {
        System.out.print("Masukan Jumlah Produk : ");
        return in.nextInt();
    }
}


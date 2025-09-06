package Inventory;

import java.util.Scanner;

public class ProductTester {
    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        
        int itemNumber,itemAvaibility;
        String itemName;
        double unitPrice;
        
        System.out.println("Enter Product 1 Data");
        System.out.print("Item Number: ");
        itemNumber = in.nextInt();
        System.out.println("Item Name: ");
        in.nextLine();
        itemName = in.nextLine();
        System.out.print("Item Avaiblity: ");
        itemAvaibility = in.nextInt();
        System.out.println("Unit Price: ");
        unitPrice = in.nextDouble();
        Product p1 = new Product(itemNumber,itemName,itemAvaibility,unitPrice);

        System.out.println("Enter Product 2 Data");
        System.out.print("Item Number: ");
        itemNumber = in.nextInt();
        System.out.println("Item Name: ");
        in.nextLine();
        itemName = in.nextLine();
        System.out.print("Item Avaiblity: ");
        itemAvaibility = in.nextInt();
        System.out.println("Unit Price: ");
        unitPrice = in.nextDouble();
        Product p2 = new Product(itemNumber,itemName,itemAvaibility,unitPrice);

        in.close();

        Product p3 = new Product(101,"Mouse",18,210000);
        Product p4 = new Product(102,"Keyboard",20,500000);
        Product p5 = new Product(103,"Monitor",30,2000000);
        Product p6 = new Product(104,"Laptop",30,210000000);

        p6.setActive(false);

        System.out.println("=======Product 1=======");
        System.out.println(p1);

        System.out.println("\n=======Product 2=======");
        System.out.println(p2);

        System.out.println("\n=======Product 3=======");
        System.out.println(p3);

        System.out.println("\n=======Product 4=======");
        System.out.println(p4);

        System.out.println("\n=======Product 5=======");
        System.out.println(p5);

        System.out.println("\n=======Product 6=======");
        System.out.println(p6);

    }
}

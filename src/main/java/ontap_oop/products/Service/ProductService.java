package ontap_oop.products.Service;

import java.util.ArrayList;
import java.util.Scanner;


public class ProductService {
    private Product product;

    public Product creatProduct(Scanner scanner, String name, int id, String description, int quantity, double price, String unit,
                                ArrayList<Product> products){
        System.out.println("Please enter quantity of products: ");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++){
            System.out.println("Enter name: ");
            name = scanner.nextLine();
            System.out.println("Enter id: ");
            id = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter description: ");
            description = scanner.nextLine();
            System.out.println("Enter quantity: ");
            quantity = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter price: ");
            price = Integer.parseInt(scanner.nextLine());
            System.out.println("Enter unit: ");
            unit = scanner.nextLine();
            products.set(i, new Product(id, name, description, quantity, price, unit));
        }

        return creatProduct(scanner, name, id, description, quantity, price, unit, products);

    }

}

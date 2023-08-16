package ontap_oop.products.Service;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductService productService = new ProductService();
        ArrayList<Product> products = new ArrayList<>();
        //productService.creatProduct(scanner, name, id, description, quantity, price, unit, products);

        //products.creatProduct();
        System.out.println(products);
        /*String searchName = scanner.nextLine();
        Product foundProduct = Findname.findProductByName(products, searchName);

        if (foundProduct != null) {
            System.out.println("Tìm thấy sản phẩm: " + foundProduct.getName());
        } else {
            System.out.println("Không tìm thấy sản phẩm có tên: " + searchName);
        }*/
    }
}

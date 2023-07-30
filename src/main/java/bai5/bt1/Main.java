package bai5.bt1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập id sp: ");
        String id = scanner.nextLine();
        System.out.println();
        System.out.println("Mời nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());

        Product product = new Product(id, name, price);
        System.out.println(product);
        double vatPrice = product.calculateVat();
        System.out.println(vatPrice);
    }
}

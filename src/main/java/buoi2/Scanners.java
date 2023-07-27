package buoi2;

import java.util.Scanner;

public class Scanners {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập tên: ");
        String name = scanner.nextLine();
        System.out.println(name);
        System.out.print("Mời nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println(address);
        System.out.print("Mời nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println(age);
        System.out.print("Mời nhập email: ");
        String email = scanner.nextLine();
        System.out.println(email);

        System.out.printf("Có %d học sinh trong lớp học", 2);
    }
}

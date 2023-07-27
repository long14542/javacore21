package buoi3;

import java.util.Scanner;

public class Bt4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhap username: ");
        String username = scanner.nextLine();
        String a = "techmaster";
        System.out.print("Mời nhap password: ");
        String password = scanner.nextLine();
        String b = "hoclacoviec";
        if(username.equals(a) && password.equals(b)) System.out.println("Đăng nhập thành công");

        else System.out.println("Tài khoản không tồn tại, vui long thử lại");

    }
}

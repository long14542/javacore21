package buoi3;

import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();
        double x;
        if(a == 0 && b == 0){
            System.out.println("Vô số nghiệm");
        } else if (a == 0) {
            System.out.println("Vô nghiệm");
        } else {
            x = -b/a;
            System.out.println("Pt có nghiệm x là: " + x);
        }


    }
}

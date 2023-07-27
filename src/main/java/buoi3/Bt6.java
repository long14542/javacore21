package buoi3;

import java.util.Scanner;

public class Bt6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập số a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Mời nhập số b: ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println("enter oper: ");
        String oper = scanner.nextLine();
        switch (oper){
            case "+":
                System.out.println("a+b=" +(a+b));
                break;
            case "-":
                System.out.println("a-b=" +(a-b));
                break;
            case "*":
                System.out.println("a*b=" +(a*b));
                break;
            case "/":
                System.out.println("a/b=" +(a/b));
                break;
            default:
                System.out.println("Ko hợp lệ");
        }
    }
}

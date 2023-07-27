package buoi3;

import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập giá trị b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập giá trị c: ");
        double c = scanner.nextDouble();
        double x;
        double x1;
        double x2;
        if(a == 0 && b != 0){
            x = -c/b;
            System.out.println("PT có nghiệm là: " + x);
        } else{
            double delta = Math.pow(b, 2) - 4*a*c;
            if(delta<0) System.out.println("Vô nghiệm");
             else if (delta == 0) {
                x = -b/a;
                System.out.println("PT có nghiệm là: " + x);
            } else{
                x1= (-b- Math.sqrt(delta)) / (2*a);
                x2 = (-b + Math.sqrt(delta))/(2*a);
                System.out.printf("Pt có 2 nghiệm x1 = %f và x2 = %f là: ",x1, x2);
            }
        }

    }
}

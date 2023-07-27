package buoi3;

import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập số điện đã sử dụng: ");
        double x = scanner.nextDouble();
        double gia;
        if(x >= 0 && x <= 50){
            gia = x*1000;
            System.out.println("Tiền điện là: " + gia);
        } else if (x > 50) {
            double sodienvuothanmuc = x-50;
            gia = sodienvuothanmuc*1200 + 50*1000;
            System.out.println("Giá điện là: " + gia);
        }
    }
}

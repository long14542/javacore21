package bai5.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("mời nhập chiều dài hcn: ");
        double chieudai = Double.parseDouble(scanner.nextLine());
        System.out.print("Mời nhập chiều rộng: ");
        double chieurong = Double.parseDouble(scanner.nextLine());
        Hcn hcn = new Hcn(chieudai, chieurong);
        double dientichhcn = hcn.dienTich();
        System.out.println("Diện tích hcn là: " + dientichhcn);
        double chuvihcn = hcn.chuVi();
        System.out.println("Chu vi hcn là: " + chuvihcn);
        System.out.print("Mời nhập cạnh hình vuông: ");
        double canh = Double.parseDouble(scanner.nextLine());
        Hinhvuong hinhvuong = new Hinhvuong(canh);
        double dientichhv = hinhvuong.dienTich();
        System.out.println("Diện tích hình vuông là: " + dientichhv);
        double chuvihv = hinhvuong.chuVi();
        System.out.println("Chu vi hình vuông là: " + chuvihv);
    }

}

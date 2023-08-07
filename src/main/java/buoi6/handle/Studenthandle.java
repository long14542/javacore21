package buoi6.handle;

import buoi6.Sinhvien.SinhVienBiz;
import buoi6.Sinhvien.SinhVienIT;

import java.util.Scanner;

public class Studenthandle {
    public SinhVienBiz createStudentBiz(Scanner scanner, String name, String major){
        System.out.println("Mời bạn nhập đểm marketting: ");
        double marketting = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập điểm sales: ");
        double sales = Double.parseDouble(scanner.nextLine());
        return new SinhVienBiz(name, major, marketting, sales);
    }
    public SinhVienIT createrStudentIT(Scanner scanner, String name, String major){
        System.out.println("Moi nhap diem css: ");
        double css = Double.parseDouble(scanner.nextLine());
        System.out.println("Moi nhap diem html: ");
        double html = Double.parseDouble(scanner.nextLine());
        System.out.println("nhap diem java: ");
        double java = Double.parseDouble(scanner.nextLine());
        return new SinhVienIT(name, major, css, html, java);
    }
}

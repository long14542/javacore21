package buoi6.Sinhvien;

import buoi6.handle.Studenthandle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhâp so sinh viên: ");
        int n = Integer.parseInt(scanner.nextLine());
        System.out.println();
        SinhVienTechMaster[] sinhvien = new SinhVienTechMaster[n];
        int count = 0;
        do {
            System.out.println("Bạn muốn nhập sinh viên IT hay IT (B/T)");
            String choose = scanner.nextLine();
            Studenthandle handle = new Studenthandle();
            System.out.println("Mời bạn nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("Mời bạn nhập chuyên nghành: ");
            String major = scanner.nextLine();
            switch (choose) {
                case "B" -> sinhvien[count] = handle.createStudentBiz(scanner, name, major);
                case "I" -> sinhvien[count] = handle.createrStudentIT(scanner, name, major);
            }
            count++;
        } while (count<n);
        System.out.println("Danh sách sinh viên là: "+ Arrays.toString(sinhvien));
    }
}

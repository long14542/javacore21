package buoi2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời bạn nhập tên hành nhập kho: ");
        String kho = scanner.nextLine();
        System.out.print("Mời bạn nhập ngày tháng năm sinh: ");
        String ntns = scanner.nextLine();
        LocalDate cld = LocalDate.parse(ntns, DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println(cld);
        System.out.print("Mời bạn nhập thời gian nhập hàng: ");
        String tnhap = scanner.nextLine();
        LocalDateTime lcdt = LocalDateTime.parse(tnhap, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(lcdt);
        System.out.print("Mời bạn nhập thời gian: ");
        String t = scanner.nextLine();
        LocalTime lct = LocalTime.parse(t, DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(lct);
    }
}

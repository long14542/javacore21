package hoc_interface.demo.bt1;

import java.util.Scanner;

public class NewService {
    public News newsInfo(Scanner scanner){
        System.out.println("Nhập tiêu đề: ");
        String title = scanner.nextLine();
        System.out.println("Nhập tác giả: ");
        String author = scanner.nextLine();
        System.out.println("Nhập ngày xuất bản: ");
        String publicDate = scanner.nextLine();
        System.out.println("Nhập điểm đánh giá: ");
        double rate = Integer.parseInt(scanner.nextLine());
        return new News(title, author, publicDate, rate);
    }
}

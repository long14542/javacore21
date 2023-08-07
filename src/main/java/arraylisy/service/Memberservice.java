package arraylisy.service;

import arraylisy.Member;

import java.time.LocalDate;
import java.util.Scanner;

public class Memberservice {
    public Member createMember(Scanner scanner) {
        System.out.println("Mời bạn nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập dob: ");
        LocalDate dob = LocalDate.parse(scanner.nextLine());
        System.out.println("mhaapj job: ");
        String job = scanner.nextLine();
        return new Member(name, dob, job);
    }
}


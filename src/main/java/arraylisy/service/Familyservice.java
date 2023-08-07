package arraylisy.service;

import arraylisy.Family;
import arraylisy.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class Familyservice {

    public Family inputInfo(Scanner scanner, Memberservice memberservice, ArrayList<Member> members) {
            System.out.println("Mời nhập địa chỉ: ");
            String address = scanner.nextLine();
            System.out.println("Nhập số lượng thành viên trong gia đình: ");
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                Member member = memberservice.createMember(scanner);
                members.add(member);
            }

        return new Family(address, members);
    }
}


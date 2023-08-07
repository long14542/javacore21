package arraylisy;

import arraylisy.service.Familyservice;
import arraylisy.service.Memberservice;
import arraylisy.service.Memberservice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số member gia đình: ");
        int n = Integer.parseInt(scanner.nextLine());
        Memberservice memberService = new Memberservice();
        ArrayList<Member> members = new ArrayList<>();

        Familyservice service = new Familyservice();
        Family family = service.inputInfo(scanner, memberService, members);
        System.out.println(family);
    }
}

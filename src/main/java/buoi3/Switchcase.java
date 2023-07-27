package buoi3;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 10;
        switch (x){
            case 1:
                System.out.println("đúng x=1");
                break;
            case 3:
                System.out.println("Đúng x=3");
                break;
            default:
                System.out.println("x = " +x);
        }
    }
}

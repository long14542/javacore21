package buoi3;

import java.util.Scanner;

public class Bt8 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int sum = 0;
            char choice;

            do {
                System.out.print("Nhập vào một số nguyên: ");
                int number = scanner.nextInt();
                sum += number;

                System.out.print("Do you want to continue? (Y/N): ");
                choice = scanner.next().charAt(0);
            } while (choice == 'Y' || choice == 'y');

            System.out.println("Tổng các số đã nhập: " + sum);
        }
    }


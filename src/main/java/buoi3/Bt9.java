package buoi3;

import java.util.Scanner;

public class Bt9 {
    public static void main(String[] args) {
        String choose = "";
        int sum = 0;
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời bạn nhập n: ");
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println("Do you want to continue?(T/N)");
            choose = scanner.nextLine();
            if (choose.equalsIgnoreCase("n")){
                sum+=n;
                System.out.println(sum);
                break;
            } else if (choose.equals("y")) sum+=n;
        }while (true);
    }
}

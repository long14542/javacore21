package buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class Bt1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Mời nhập số n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arrayInteger = new int[n];
        for (int i = 0; i < n; i++){
            System.out.println("Mời bạn nhập số thứ: "+(i+1));
            int x = Integer.parseInt(scanner.nextLine());
            arrayInteger[i] = x;

        }
        System.out.println(Arrays.toString(arrayInteger));
        /*
            for (int i = 0; i < n; i++){
            System.out.println("a["+i+"] = "+ arrayInteger[i]);
            }
            */
    }
}

package buoi3;

import java.util.Scanner;

public class Bt7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("mời nhập n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        /*for (int i = 1; i <= n; i++){
            sum = sum + i;
        }
        System.out.println(sum);*/
        for (int i = 2; i <= n; i+=2){
            sum = sum + i;
        }
        System.out.println(sum);
        int tich = 1;
        for (int i = 2; i <= n; i+=2){
            tich = tich * i;
        }
        /* cách 2
        for (int i = 2; i <= n; i++){
           if(i%2==0) tich*=i;
        }
         */

        while (n>0){
            if (n%2==0){
                sum+= n;
            }
            n--;
            System.out.println(sum);
        }
        System.out.println(tich);
    }
}

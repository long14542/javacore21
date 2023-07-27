package buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class Bt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời nhập số n: ");
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n];
        for (int i=0; i < n; i++){
            System.out.println("Mời bạn nhập số thứ: "+i);
            int x = Integer.parseInt(scanner.nextLine());
            arr[i] = x;
            if (arr[i] % 2 == 0){
                arr[i]+=1;
            }
        }
        //System.out.println(Arrays.toString(arr));
        System.out.println("thêm một phần tử vào mảng");
        int[] arrNew = new int[n+1];
        for (int i=0; i<n; i++){
            arrNew[i] = arr[i];
        }
        System.out.println("Mời bạn nhập giá trị muốn thêm vào mảng: ");
        int value = Integer.parseInt(scanner.nextLine());
        arrNew[n] = value;
        System.out.println("ArrayNew: "+ Arrays.toString(arrNew));
        //for (int i = 0; i < arr.length; i++){

    }
}


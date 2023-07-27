package buoi4;

import java.util.Arrays;
import java.util.Scanner;

public class Bt3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 4, 0, 1, 3};
        int[] arrNew = new int[7];
        System.arraycopy(arr, 0, arrNew, 0, arr.length);
        int value = Integer.parseInt(scanner.nextLine());
        arr[2] = value;
        int temp = arrNew[2];
        arrNew[2] = arrNew[3];
        arrNew[3] = temp;

        boolean swapped;

        for (int i = 0; i < arr.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp1 = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp1;
                    swapped = true;
                }
            }


            if (!swapped) {
                break;
            }

            System.out.println(Arrays.toString(arrNew));
        }
    }
}

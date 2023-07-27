package buoi4;

import java.util.Scanner;

public class Mang2chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Mời nhập mảng n: ");
        System.out.print("Mời nhâp số hàng của mảng 1: ");
        int row = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời nhâp số côt của mảng 1: ");
        int column = Integer.parseInt(scanner.nextLine());
        int[][] arr = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println("Mời bạn nhập giá trị cho a[" + i + "][" + j + "]");
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.println(arr[i][j]+"\t");
            }
        }
        System.out.print("Mời nhâp số hàng của mảng 2: ");
        int row1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Mời nhâp số côt của mảng 2: ");
        int column1 = Integer.parseInt(scanner.nextLine());
        int[][] arr1 = new int[row1][column1];
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.println("Mời bạn nhập giá trị cho a[" + i + "][" + j + "]");
                arr1[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.println(arr1[i][j]+"\t");
            }
        }
        if (row != row1 && column != column1) System.out.println("Không thể thực hiện");
        else if(row == row1 && column == column1) {
            int[][] arr2 = new int[row][column];
            for (int i = 0; i < row; i++){
                for (int j = 0; j < row1; j++){
                    arr2[i][j] = arr[i][j] + arr1[i][j];
                }
            }
        }
    }
}

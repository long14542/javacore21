package buoi3;

import java.util.Scanner;

public class dieukien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm: ");
        double score = scanner.nextDouble();
        if (score>8) {
            System.out.println("HSG");
        } else if (score>=6.5 && score<8){
            System.out.println("HSK");
        } else {
            System.out.println("HSK");
        }
    }
}

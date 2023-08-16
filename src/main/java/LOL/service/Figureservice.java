package LOL.service;

import LOL.Figure;

import java.util.Scanner;

public class Figureservice {
    public Figure figureInfo(Scanner scanner){
        System.out.println("Nhập tên tướng: ");
        String name = scanner.nextLine();
        System.out.println("Nhập vị trí tướng: ");
        String position = scanner.nextLine();
        return new Figure(name, position);
    }
}

package LOL.service;

import LOL.Figure;
import LOL.Team;

import java.util.ArrayList;
import java.util.Scanner;

public class Teamservice {
    public Team inputInfor(Scanner scanner, Figureservice figureservice, ArrayList<Figure> figures){
        System.out.println("Nhập tên đội 1: ");
        String name1 = scanner.nextLine();
        System.out.println("Nhập tên đội 2: ");
        String name2 = scanner.nextLine();
        System.out.println("Nhap so luong vi tuong");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            Figure figure = figureservice.figureInfo(scanner);
            figures.add(figure);
        }
        return new Team(name1, name2, figures);
    }
}

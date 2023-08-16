package LOL;

import LOL.service.Figureservice;
import LOL.service.Teamservice;
import arraylisy.service.Familyservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Figureservice figureservice = new Figureservice();
        ArrayList<Figure> figures = new ArrayList<>();

        Teamservice teamservice = new Teamservice();
        Team team = teamservice.inputInfor(scanner, figureservice, figures);
        System.out.println(team);
    }
}

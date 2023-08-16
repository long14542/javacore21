package tiktok.service;

import LOL.service.Figureservice;
import tiktok.Follower;
import tiktok.Idol;

import java.util.ArrayList;
import java.util.Scanner;

public class Idolservice {
    public Idol idolInfo(Scanner scanner, Followerservice followerservice, ArrayList<Follower> followers){
        System.out.println("Nhap ten idol: ");
        String name = scanner.nextLine();

        System.out.println("Nhap email idol: ");
        String email = scanner.nextLine();
        System.out.println("Nhap nhom: ");
        String group = scanner.nextLine();

        System.out.println("Nhap so luong follower: ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++){
            Follower follower = followerservice.followerInfo(scanner);
            followers.add(follower);
        }
        return new Idol(name, email, followers, group);
    }
}

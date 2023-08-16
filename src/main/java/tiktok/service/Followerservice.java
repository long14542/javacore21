package tiktok.service;

import tiktok.Follower;

import java.util.Scanner;

public class Followerservice {
    public Follower followerInfo(Scanner scanner) {

        System.out.println("nhap ten follower: ");
        String name = scanner.nextLine();
        System.out.println("Nhap email follower: ");
        String email = scanner.nextLine();
        System.out.println("Nhap number of like: ");
        int numberoflike = Integer.parseInt(scanner.nextLine());
        return new Follower(name, email, numberoflike);
    }
}

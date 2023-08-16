package tiktok.service;

import tiktok.Song;

import java.util.ArrayList;
import java.util.Scanner;

public class Songservice {
    public Song songInfo(Scanner scanner, Songservice songservice, ArrayList<Song> songs){
        System.out.println("Nhap ten bai hat: ");
        String song = scanner.nextLine();
        System.out.println("Nhap ca si: ");
        String singer = scanner.nextLine();
        return new Song(song, singer);
    }
}

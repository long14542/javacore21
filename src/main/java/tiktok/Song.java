package tiktok;

import tiktok.service.Songservice;

import java.util.ArrayList;
import java.util.Scanner;

public class Song {
    private String name;
    private int id;
    public static int auToId = 0;
    private String singer;

    public Song(String name, String singer) {
        this.name = name;
        this.id = ++auToId;
        this.singer = singer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getAuToId() {
        return auToId;
    }

    public static void setAuToId(int auToId) {
        Song.auToId = auToId;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", singer='" + singer + '\'' +
                '}';
    }
}

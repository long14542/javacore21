package tiktok;

import java.util.ArrayList;

public class Idol {
    private String name;
    private int id;
    public static int autoID = 0;
    private String email;
    private ArrayList<Follower> followers;
    private String group;



    public Idol(String name, String email, ArrayList<Follower> followers, String group) {
        this.name = name;
        this.id = ++autoID;
        this.email = email;
        this.group = group;
        this.followers = followers;
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

    public static int getAutoID() {
        return autoID;
    }

    public static void setAutoID(int autoID) {
        Idol.autoID = autoID;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(ArrayList<Follower> followers) {
        this.followers = followers;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", follower=" + followers +
                ", group='" + group + '\'' +
                '}';
    }
}

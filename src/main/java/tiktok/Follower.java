package tiktok;

public class Follower {
    private String name;
    private int id;
    public static int autoid = 0;
    private String email;
    private int numberoflike;

    public Follower(String name, String email, int numberoflike) {
        this.name = name;
        this.id = ++autoid;
        this.email = email;
        this.numberoflike = numberoflike;
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

    public static int getAutoid() {
        return autoid;
    }

    public static void setAutoid(int autoid) {
        Follower.autoid = autoid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumberoflike() {
        return numberoflike;
    }

    public void setNumberoflike(int numberoflike) {
        this.numberoflike = numberoflike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", email='" + email + '\'' +
                ", numberoflike=" + numberoflike +
                '}';
    }
}

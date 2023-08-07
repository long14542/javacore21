package arraylisy;

import java.time.LocalDate;

public class Member {
    private static int autoID;
    private int id;
    private String name;
    private LocalDate dob;
    private String job;

    public Member(String name, LocalDate dob, String job) {
        this.id = ++autoID;
        this.name = name;
        this.dob = dob;
        this.job = job;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob=" + dob +
                ", job='" + job + '\'' +
                '}';
    }
}

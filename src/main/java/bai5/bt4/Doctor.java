package bai5.bt4;

public class Doctor extends Person{
    public Doctor(String name, int age, String major, double workour) {
        super(name, age);
        this.major = major;
        this.workour = workour;
    }

    private String major;
    private double workour;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getWorkour() {
        return workour;
    }

    public void setWorkour(double workour) {
        this.workour = workour;
    }

    @Override
    public String toString() {
        return "Doctor{" + "name='" + getName() + '\'' +
                "age='" + getAge() + '\'' +
                "major='" + major + '\'' +
                ", workour=" + workour +
                '}';
    }
}

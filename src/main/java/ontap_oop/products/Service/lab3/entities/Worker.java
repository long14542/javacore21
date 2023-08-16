package ontap_oop.products.Service.lab3.entities;

public class Worker {
    private static int autoID;
    private String id;

    private String name;

    private double salary;

    public Worker(String name, double salary) {
        this.id = "W "+ ++autoID;
        this.name = name;
        this.salary = salary;
    }

    public static int getAutoID() {
        return autoID;
    }

    public static void setAutoID(int autoID) {
        Worker.autoID = autoID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}







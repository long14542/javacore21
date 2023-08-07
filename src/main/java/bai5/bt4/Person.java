package bai5.bt4;

public class Person {
    private String name;
    private int age;
    public static int auID;
    private int id;


    public Person(String name, int age) {
        this.id = ++auID;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

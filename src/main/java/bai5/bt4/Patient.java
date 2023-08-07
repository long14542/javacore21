package bai5.bt4;

import java.time.LocalDate;

public class Patient extends Person {
    public Patient(String name, int age, String note, LocalDate createdDate) {
        super(name, age);
        this.note = note;
        this.createdDate = createdDate;
    }
    private String note;
    private LocalDate createdDate;

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Patient{" + "name='" + getName() + '\'' +
                "age='" + getAge() + '\'' +
                "note='" + note + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}

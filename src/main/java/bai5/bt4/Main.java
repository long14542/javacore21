package bai5.bt4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Bệnh nhân
        System.out.println("Mời bạn nhập tên bệnh nhân: ");
        String namePatient = scanner.nextLine();
        System.out.println("Mời bạn nhập tuổi: ");
        int agePatient = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập bệnh án: ");
        String note = scanner.nextLine();
        System.out.println("Nhập ngày nhập viện: ");
        String datePatient = scanner.nextLine();
        LocalDate createdDate = LocalDate.parse(datePatient, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        Patient patient = new Patient(namePatient, agePatient, note, createdDate);
        System.out.println(patient);

        //Doctor
        System.out.println("Mời nhập tên: ");
        String nameDoctor = scanner.nextLine();
        System.out.println("Mời nhập tuổi: ");
        int ageDoctor = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chuyên ngành: ");
        String major = scanner.nextLine();
        System.out.println("Nhâp số giờ làm việc: ");
        double workhour = Double.parseDouble(scanner.nextLine());
        Doctor doctor = new Doctor(nameDoctor, ageDoctor, major, workhour);

        ManageHospital manageHospital = new ManageHospital(patient, doctor);
        System.out.println(manageHospital);

    }
}

package buoi2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class localdatetime {
    public static void main(String[] args) {
        /*System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2023, 3, 22));
        LocalDate localDate = LocalDate.of(2023, 3, 22);
        LocalDate localDate1 = localDate.plusMonths(1);
        System.out.println(localDate1);
        LocalTime localTime =  LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime1 = LocalTime.of(12, 32, 33, 12);
        System.out.println(localTime1);
        System.out.println(LocalDateTime.now());
        System.out.println(localDate.isAfter(localDate1));*/

        String dateTime = "2023/03/22 17:08";
        LocalDateTime lcdt = LocalDateTime.parse(dateTime, DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm"));
        System.out.println(lcdt);
    }
}

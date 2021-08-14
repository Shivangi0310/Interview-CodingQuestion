package java8;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeApi {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalDate.of(2014, Month.AUGUST,1));
        System.out.println(LocalDate.of(2019,Month.FEBRUARY,29));
    }
}

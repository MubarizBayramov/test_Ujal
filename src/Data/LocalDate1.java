package Data;

import java.time.LocalDate;

public class LocalDate1 {
    public static void  main(String[] args){
        LocalDate toDay = LocalDate.now();
        LocalDate day = LocalDate.of(2024, 12, 15); // ozun yaratmaq
        System.out.println(toDay);
        System.out.println(day);
    }
}

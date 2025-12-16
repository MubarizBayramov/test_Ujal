package FuncsionalPr;

import java.time.MonthDay;

public class SwitchExpression1 {
    public static void main(String[] args){
        int day = 3;

        String Weekday = switch (day) { //enenevi swich qisaldilib

            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            default -> "Unknown";

        };
        System.out.println(Weekday);
    }
}

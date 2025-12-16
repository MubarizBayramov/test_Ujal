package FuncsionalPr;

import java.util.List;

public class Lambda3 {
    public static void main (String[] args){


    Runnable runnable = () -> System.out.println("Lambda salam"); // Runnable interfeysində bir metod var: run()
    new Thread (runnable).start();

    }
}

package exceptionHandler;

public class throwExcample {
    public static void chekAge(int yas){
        if(yas < 18){
            throw new IllegalArgumentException("Yas azdir");
        } else{
            System.out.println("Yas az deyil");
        }

    }


    public static void main(String[] args){
        chekAge(25);
            System.out.println("Yas boyukdur. amma islemeyecek metod");
        }

    }



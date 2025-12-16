package Metodd;

public class StringExample {
    public static void main(String[] args){

        String name = "Mubariz";
        String surname = " Bayramov";
        String middleName = " Ramiz oglu";
        String fullName = name+surname+middleName;
        int uzunluq = fullName.length();

if(name.equals(surname)){
    System.out.println("beraberdi");
} else{
    System.out.println("beraber deyil");
}
        System.out.println(fullName);
        System.out.println(fullName.length());
        System.out.println(fullName.toLowerCase());
        System.out.println(fullName.toUpperCase());

    }
}

package Metodd;

public class ReferenceTyp {
    public static void main(String[] args){
        String a = "alma"; // reference tipli dəyişən
        String b = a;   // b indi eyni obyektə istinad edir
        b = "dunya";  // a dəyişmir, çünki b indi başqa obyektə istinad edir
        System.out.println(b);

    }
}

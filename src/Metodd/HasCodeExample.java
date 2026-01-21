package Metodd;

public class HasCodeExample {
    public static void main(String[] args){

        int d= 5;
        int t = 7;
        int p = d+t;
        Integer i = p; // int ucun hashCode olmur. Integer ucun olur

String a  = "Mubariz";
String b= "Bayramov";
String c = a+b;



System.out.println(c.hashCode());
System.out.println(i.hashCode());

}
}
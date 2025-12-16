package Metodd;



public class equals1 {
    public  static void main (String[] args){

        String s1 = new String("Java");
        String s2 = new String("Java");
        String s3 = new String("LL");
        String s4 = new String("PP");


        System.out.println(s1 == s2); // false (fərqli obyektlər)
        System.out.println(s1.equals(s2)); // true  (məzmun eynidir)

        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
}

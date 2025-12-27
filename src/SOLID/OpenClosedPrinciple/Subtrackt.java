package SOLID.OpenClosedPrinciple;

public class Subtrackt extends Calculator{

    int subtract (int a, int b) {
        return a-b;  // esas sinifi deyisdirmeden genislendiririk
    }

    int add2 (int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args){
        Subtrackt S = new Subtrackt();
        S.subtract(8, 5);
        S.add(4, 6);
        S.add2(4,5,6);
        System.out.println(S.subtract(8,5));
        System.out.println(S.add(4, 6));
        System.out.println(S.add2(4,5,6));
    }

}

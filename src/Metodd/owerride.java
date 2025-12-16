package Metodd;

public class owerride {
    int add(int a, int b){
        return a+b;
    }


    int add(int a, int b, int c){
    return a+b+c;

    }


    double add(int a, int b, int c, int d){
        return a+b+c+d;
    }


    public static void main(String[] args){

    owerride o = new owerride();
        System.out.println(o.add(2,5));
        System.out.println(o.add(2,5,6));
        System.out.println(o.add(2,5,6, 7));





    }
}


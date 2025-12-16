package Array;

public class VarArgsExample {



    public static void PrintVar(int... numbers) {
        for (int n : numbers) {
        System.out.println(n + " ");
    }
System.out.println();

    }

public static void main(String[] args){


    PrintVar(1, 2, 3, 4);
    PrintVar(1, 2, 3, 4);
    PrintVar(1, 2, 3, 4);

}
}
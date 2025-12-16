package Metodd;

public class VariableArguments {

    static void VariableArg(int...numbers){
        for(int n : numbers)
            System.out.println(n);
    }


    public static void main(String[] args) {
        VariableArg(1);
        VariableArg(1, 2);
        VariableArg(1, 2,3);
        VariableArg(1, 2,4);
        VariableArg(1, 2,5,6,7);
        VariableArg(1, 2,7,8,9,11);
        VariableArg(1, 2,85,785,15);
    }
    }

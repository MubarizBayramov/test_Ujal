package SOLID.InterfaceSegregationPrinciple;

public class Robot implements Worker{
    @Override
    public void work() {
        System.out.println("Robot isleyir");
    }

    public static void main(String[] args){
        Robot R = new Robot();
        R.work();
        }

    }


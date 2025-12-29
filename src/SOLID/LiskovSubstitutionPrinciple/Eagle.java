package SOLID.LiskovSubstitutionPrinciple;

public class Eagle extends Bird{
    @Override
    void fly() {
        super.fly();
    }

    public static void main(String[] args){

        Bird E = new Eagle();
        Bird P = new Penguin();
        P.fly(); // xeta verecek
        E.fly();

    }
}

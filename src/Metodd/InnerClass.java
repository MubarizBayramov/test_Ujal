package Metodd;

public class InnerClass {
    String name;


    public InnerClass(String name){
        this.name=name;
           }

    class Car{
        String model;

        public Car(String model){
            this.model=model;
        }
        public void engine(){
            System.out.println(name + model);
        }
    }


public static void main(String[] args){
// esas class obyektini yarat
        InnerClass innerClass = new InnerClass("Mersi");

    // daxili class obyektini yarat
        InnerClass.Car ic = innerClass.new Car("EC");
        ic.engine();


}


}

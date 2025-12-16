package ObjectClass;

public class CarObject {
    public static void main(String[] args){

        Car mycar = new Car(); // metod ile yaradilib

        mycar.name = "BMW";
        mycar.color = "Black";
        mycar.engine();
        System.out.println("Car name: " + mycar.name);
        System.out.println("Car color: " + mycar.color);

    }
}

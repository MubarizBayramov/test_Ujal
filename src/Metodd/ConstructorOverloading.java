package Metodd;

public class ConstructorOverloading {
    String model;
    int year;

    ConstructorOverloading(String m, int y) {
        model = m;
        year = y;
    }

    ConstructorOverloading(){
        model = "Mersi";
        year = 1980;

    }
ConstructorOverloading(String m){
        model = "BMW";
        year = 1990;
        }


void display (){
        System.out.println("Model: " + model + ", Year: " + year);
}


    public static void main(String[] args) {
        ConstructorOverloading C = new ConstructorOverloading();
        ConstructorOverloading C1 = new ConstructorOverloading();
        ConstructorOverloading C2 = new ConstructorOverloading("BMW",1990);
        C.display();
        C1.display();
        C2.display();

    }
}

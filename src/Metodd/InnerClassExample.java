package Metodd;

public class InnerClassExample {
    private int x = 10;


    class Inner {
        void sound() { // daxili sinifin metodu
            System.out.println("X = " + x);
        }
    }


        void display() { //ust sinifin metodu
            Inner I = new Inner();
            I.sound();
        }

        public static void main(String[] args) {
                InnerClassExample IC = new InnerClassExample();
                IC.display();

            }
        }



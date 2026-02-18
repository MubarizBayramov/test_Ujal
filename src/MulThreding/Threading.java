package MulThreding;

public class Threading extends Thread{

    public static void main(String[] args){

        Threading MT = new Threading();
        MT.start();

        System.out.println(MT);
        }




    @Override
    public void run() {
        System.out.println("Thread basladi");
    }

}

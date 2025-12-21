package Metodd;

class Thread1 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Birinci isleyir");
        }
    }
}

class Thread3 extends Thread {
    public void run() {
        for (int i = 1; i <= 4; i++) {
            System.out.println("ucuncu isleyir");
        }
    }
}

class Thread2 extends Thread{
    public void run(){
        for(int i = 1; i <= 2; i++){
            try {
                Thread.sleep(2000);  // 2 saniye gozleyir. trycatchsiz sleep olmaz
            } catch (InterruptedException e){
                e.printStackTrace();

           }
        System.out.println("Ikinci isleyir");
    }
}
}


class Thread4 extends Thread {
    public synchronized void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("dorduncu isleyir");
        }
    }
}

public class ThreadExample {
        public static void main(String[] args)  throws InterruptedException {
    Thread1 T1 = new Thread1();
    Thread2 T2 = new Thread2();
    Thread3 T3= new Thread3();
    Thread4 T4= new Thread4();

        T1.start();
        T1.join();
        T2.start();
        T2.join(); // t2 bitmədən t3 başlamayacaq/  join novbe gozledir
        T3.start();
        T4.start();


}

}
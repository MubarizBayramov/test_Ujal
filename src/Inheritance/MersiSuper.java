package Inheritance;

public class MersiSuper extends CarSuper{
    void soundMersiSuper () {
        super.sound();
    }


    void soundMersi(){
        System.out.println("Mersi ses salir");
    }
    public static void main(String[] args){
        MersiSuper M = new MersiSuper();
        M.sound();
        M.soundMersi();
    }
}

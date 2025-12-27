package Abstraction;

public class ManWomanMain extends Human{

    @Override
    void ses(){
        System.out.println("Kisi ses salir");
    }


    class Woman extends Human {
        @Override
        void ses (){
            System.out.println("Qadin ses salir");
        }
    }

    public void main(String[] args){

        Human K = new ManWomanMain();
        Human Q = new Woman();

        K.ses();
        Q.ses();
    }
}

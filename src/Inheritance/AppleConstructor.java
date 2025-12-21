package Inheritance;

public class AppleConstructor extends TelephoneConstructor{
    AppleConstructor(){
        super();
            System.out.println("Alt sinif Ust sinifin konstruktorunu cagirir");
        }


        public static void main(String[] args){

        AppleConstructor AC = new AppleConstructor();

        }
    }


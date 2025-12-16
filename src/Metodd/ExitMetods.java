package Metodd;

public class ExitMetods {
    public static void main(String[] args){
        boolean errorVar = true;
        if (errorVar){
            System.out.println("Xeta var");
            System.exit(1); // exit metodu dayandirdi
        }

// Bu sətir heç vaxt işləməyəcək, çünki System.exit() proqramı dayandırır
        System.out.println("Bu mesajı görməyəcəksiniz.");
    }
}

package Metodd;

public class GC {

    public static void main(String[] args){

        Object ob = new Object();
                ob = null; // artiq islemir. ona gore de GC ise dusur
        System.gc();
        System.out.println("dayandi");
        }
    }


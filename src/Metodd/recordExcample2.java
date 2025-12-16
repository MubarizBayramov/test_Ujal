package Metodd;

public record recordExcample2(String name, int age) {}


class Main {
    public static void main(String[] args){

        recordExcample2 st = new recordExcample2("Mubariz", 18);
        System.out.println(st.name());
        System.out.println(st.age());

        }

    }


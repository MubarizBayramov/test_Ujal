package Metodd;

import java.util.Optional;

public class Optinal {
    public static void main(String[] args){


        // 1️⃣ Dəyər olan Optional
        Optional<String> name = Optional.of("Mubariz");

        if (name.isPresent()) {
            System.out.println("Ad var: " + name.get());
        } else {
            System.out.println("Ad yoxdur");
        }


}}

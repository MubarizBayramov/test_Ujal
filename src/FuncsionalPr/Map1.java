package FuncsionalPr;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {
    public static void main(String [] args){

         Map<String, String> adlar = new HashMap<>();
         adlar.put("Mubariz", "055 640 40 39");
        adlar.put("Yolu", "055 660 4055 39");
        adlar.put("Isi", "055 6460 40 639");
        adlar.put("Solmaz", "055 5640 40 539");
        adlar.put("Ugur", "055 6430 430 39");

System.out.println(adlar);
System.out.println("Mubariz: " + adlar.get("Mubariz"));
        System.out.println("Keys: " + adlar.keySet()); // acarlarin siyahisi
        System.out.println("Keys: " + adlar.values()); // deyerlerin siyahisi

        adlar.remove("Ugur"); // ugur silindi
        System.out.println("Silindikden sonra: " + adlar);




// treeMap
        Map<String, String> boys = new TreeMap<>(); // ardicilligi qoruyur
        boys.put("MubarizBayramov", "055 640346 40 39");
        boys.put("YoluCulayev", "055 5656660 4055 39");
        boys.put("Isigedr", "055 6460 40 637769");
        boys.put("SolmazBayramova", "05535 5640 40 539");
        boys.put("UgurlarSize", "055 6430 54430 39");
        System.out.println(boys);

    }
}



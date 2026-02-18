package FuncsionalPr;



import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args){

        Optional <String> name = Optional.of("Ali");
        Optional<String> empty = Optional.empty();
        Optional<String> nullable  = Optional.ofNullable(null);
        System.out.println(name.isPresent());  // dəyər var
        System.out.println(empty.isPresent()); // dəyər yoxdur
        System.out.println(nullable.isPresent()); // dəyər ola da, olmaya da bilər
        System.out.println(name.get());  // get() metodu - əgər dəyər yoxdursa exception atır/ Ali var


    }
}

package AnonimClass;

public class Dog implements Animal {
    @Override
    public void sound(){
        System.out.println("Dog ses cixarir");
    }


  public static void main(String[] args){
        Dog d = new Dog();
        d.sound();
  }

}

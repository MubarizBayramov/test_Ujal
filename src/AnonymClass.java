abstract class AnonymClass {
    abstract void sound();
            public static void main(String[] args) {
    AnonymClass heyvan = new AnonymClass() {
        @Override
        void sound() {
            System.out.println("heyvan ses cixarir");
        }

    };
    heyvan.sound();

}
}
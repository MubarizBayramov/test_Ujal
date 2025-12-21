package ObjectClass;

public class Telephon {

        private String model;

        public void setModel(String model){
        this.model = model;
        }

    public String getModel() {
        return model;
    }

    public static void main(String[] args){

            Telephon T = new Telephon();
            T.setModel("Samsung");


        System.out.println(T.getModel());
    }
}



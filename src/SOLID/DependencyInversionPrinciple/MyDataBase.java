package SOLID.DependencyInversionPrinciple;

class MyDataBase implements DataBase {
    @Override
    public void connect() {
        System.out.println("DataBasey' qosuldu");
    }
public static void main(String[] args){
        MyDataBase db = new MyDataBase();
        db.connect();
}
        }


// Yüksək səviyyəli modullar aşağı səviyyəli modullara birbaşa bağlı olmamalıdır; hər ikisi abstraksiyalara bağlı olmalıdır.

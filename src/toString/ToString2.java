package toString;
public class  ToString2 {
    String ad;
    int yas;

    public ToString2 (String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }



    @Override
    public String toString() {
        return "Ad: " + ad + "Yas: " + yas;

    }
}
package UncheckedException;

public class BankBalance {
    public  void withdraw(int balance, int money){
        if(balance < money){
            throw new BalanceException("Balansda pul yoxdur");

        } System.out.println("Pulunuzu goturun");
    }


    public static void main(String[] args){
        BankBalance bank = new BankBalance();

        bank.withdraw (500, 400);
    }
}

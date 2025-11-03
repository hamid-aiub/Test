public class Account{
    String account_number;
    double balance;
    public static int perDayTx;

    Account(String account_number, double balance){
        this.account_number = account_number;
        this.balance = balance;
    }

    void display(){
        System.out.println("Account number is..."+account_number);
        System.out.println("Balance is .."+balance);
        System.out.println("Per day Tx Limit is ..."+perDayTx);

    }
}
public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");
         Account a1 = new Account("10101356565656", 500);
         a1.perDayTx = 100;
         a1.display();

        System.out.println("Printing Account 2 details...");

         Account a2 = new Account("1010101010143434", 10000);
         a2.display();

         StaticBlock sb = new StaticBlock();
    }
}
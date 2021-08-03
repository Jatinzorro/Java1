
public class YourFirstBankTransfer {

    public static void main(String[] args) {
        // Do not touch the code in Account.java
        // write your program here
        Account mathew=new Account("Matthews account",1000);
        Account my=new Account("My account",0);
        mathew.withdrawal(100.0);
        my.deposit(100.0);
        System.out.println(mathew);
        System.out.println(my);
        
    }
}

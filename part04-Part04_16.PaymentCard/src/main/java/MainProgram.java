
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!
        PaymentCard paul = new PaymentCard(20);
        PaymentCard matt = new PaymentCard(30);
        paul.eatHeartily();
        matt.eatAffordably();
        System.out.println("Paul: The card has a balance of "+paul.getBalance()+" euros");
        System.out.println("Matt: The card has a balance of "+matt.getBalance()+" euros");
    
        paul.addMoney(20.0);
        matt.eatHeartily();
        System.out.println("Paul: The card has a balance of "+paul.getBalance()+" euros");
        System.out.println("Matt: The card has a balance of "+matt.getBalance()+" euros");
        
        paul.eatAffordably();
        paul.eatAffordably();
        matt.addMoney(50.0);
        System.out.println("Paul: The card has a balance of "+paul.getBalance()+" euros");
        System.out.println("Matt: The card has a balance of "+matt.getBalance()+" euros");
        
        
    }
}

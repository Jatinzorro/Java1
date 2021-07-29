
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String q="Caput Draconis";
        String p=scan.nextLine();
        if(p.equals(q)){
            System.out.println("Welcome!");
        }else{
            System.out.println("Off with you!");
        }
        // Write your program here 
    }
}


import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Shall we carry on?");
        String val=scanner.nextLine();
        while(!"no".equals(val)){
            System.out.println("Shall we carry on?");
            val=scanner.nextLine();
        }
    }
}

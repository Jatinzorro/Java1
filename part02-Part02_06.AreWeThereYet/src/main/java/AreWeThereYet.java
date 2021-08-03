
import java.util.Scanner;

public class AreWeThereYet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int val=scanner.nextInt();
        while(true){
            if(val==4){
                break;
            }
            System.out.println("Give a number:");
            val=scanner.nextInt();
        }
    }
}


import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String val=scanner.nextLine();
        int value=Integer.valueOf(val);
        System.out.println("You gave the number "+value);

    }
}

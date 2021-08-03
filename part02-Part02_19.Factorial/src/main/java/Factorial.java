
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int low=scanner.nextInt();
        int fact=1;
        for(int i=2;i<=low;i++){
            fact=fact*i;
        }
        System.out.println("Factorial: "+fact);
    }
}

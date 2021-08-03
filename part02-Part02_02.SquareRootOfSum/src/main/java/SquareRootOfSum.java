
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int one=scanner.nextInt();
        int two=scanner.nextInt();
        int sum=one+two;
        double sr=Math.sqrt(sum);
        System.out.println(sr);
    }
}

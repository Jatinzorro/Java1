
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        while (true) {
            System.out.println("Give a number:");
            int num = scanner.nextInt();
            if (num == 0) {
                if (count == 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                }
                double avg = (sum / count);
                System.out.println(avg);
                break;
            }
            if (num > 0) {
                count++;
                sum += num;
            }
        }
    }
}

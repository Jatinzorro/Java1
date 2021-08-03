
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        double sum=0;
        while(true){
            System.out.println("Give a number:"); 
            int num=scanner.nextInt();
            if(num==0){
                double avg=(sum/count);
                System.out.println("Average of the numbers: "+avg);
                break;
            }
            count++;
            sum+=num;
        }
    }
}

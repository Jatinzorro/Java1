
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count=0;
        int sum=0;
        int big=0;
        String name = null;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            if(pieces[0].length()>big){
                big=pieces[0].length();
                name=pieces[0];
            }
            sum+=Integer.valueOf(pieces[1]);
            count++;
            
        }
        double avg=sum/(double)count;
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+avg);

    }
}

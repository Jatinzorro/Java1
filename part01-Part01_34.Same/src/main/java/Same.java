
import java.util.Scanner;

public class Same {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first string:");
        String p=scan.nextLine();
        System.out.println("Enter the second string:");
        String q=scan.nextLine();
        if(p.equals(q)){
            System.out.println("Same");
        }else{
            System.out.println("Different");
        }
        // Write your program here. 
    }
}

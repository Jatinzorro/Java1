
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
        
        Statistics obj=new Statistics();
        Statistics even=new Statistics();
        Statistics odd=new Statistics();
        
        while(true){
            System.out.println("Enter numbers: ");
            int val=scanner.nextInt();
            if(val==-1){
                break;
            }
            obj.addNumber(val); 
            if(val%2==0){
                even.addNumber(val);
            }else{
                odd.addNumber(val);
            }
        }
        System.out.println("Sum: "+obj.sum());
        System.out.println("Sum of even numbers: "+even.sum());
        System.out.println("Sum of odd numbers: "+odd.sum());
    }
}

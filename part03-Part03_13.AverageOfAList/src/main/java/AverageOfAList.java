
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        
        while(true){
            int val=Integer.valueOf(scanner.nextLine());
            if(val==-1){
                break;
            }
            list.add(val);
        }

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        int sum=0;
        for(int num:list){
            sum+=num;
        }
        double size=list.size();
        double avg=sum/size;
        System.out.println("Average: "+avg);
    }
}

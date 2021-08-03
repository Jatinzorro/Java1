
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        ArrayList<Integer> list = new ArrayList<>();
        
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        int place=0;
        int small=list.get(0);
        int index=list.size();
        for(int i=1;i<index;i++){
            if(list.get(i)<small){
                small=list.get(i);
                place=i;
            }
        }
        System.out.println("Smallest number: "+small);
        
        System.out.println("Found at index: "+place);
        
    }
}

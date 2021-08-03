
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Give a number:");
            int val=scanner.nextInt();
            if(val==0){
                break;
            }else if(val<0){
                System.out.println("Unsuitable number");
                continue;
            }
            System.out.println(val*val);
              
                  
            
        }
    }
}

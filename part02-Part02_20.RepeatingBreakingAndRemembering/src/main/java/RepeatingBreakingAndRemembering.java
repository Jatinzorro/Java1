
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int val=scanner.nextInt();
        int sum=0,num=0,even=0,odd=0;
        double avg=0;
        while(val!=-1){
            if(val==-1){
                
                break;
            }
            sum+=val;
            num++;
            if(val%2==0){
                even++;
            }else{
                odd++;
            }
            val=scanner.nextInt();
        }
        double nu=num;
        avg=sum/nu;
        System.out.println("Thx! Bye!");
        System.out.println("Sum: "+sum);
        System.out.println("Numbers: "+num);
        System.out.println("Average: "+avg);
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
}

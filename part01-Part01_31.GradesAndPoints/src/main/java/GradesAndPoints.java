
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("Give points [0-100]:");
        int mark=scan.nextInt();
        if(mark<0){
            System.out.println("impossible!");
        }else if(mark<50){
            System.out.println("failed");
        }else if(mark<60){
            System.out.println("1");
        }else if(mark<70){
            System.out.println("2");
        }else if(mark<80){
            System.out.println("3");
        }else if(mark<90){
            System.out.println("4");
        }else if(mark<101){
            System.out.println("5");
        }else{
            System.out.println("incredible!");
        }
    }
}

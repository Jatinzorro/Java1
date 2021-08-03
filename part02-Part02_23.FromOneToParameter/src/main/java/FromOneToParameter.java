import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int val=scan.nextInt();
        printUntilNumber(val);
    }
    public static void printUntilNumber(int number){
        for(int i=1;i<=number;i++){
            System.out.println(i);
        }
    }

}

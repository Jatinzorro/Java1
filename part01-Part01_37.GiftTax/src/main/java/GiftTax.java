
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long gift=scan.nextLong();
        if(gift<5000){
            System.out.println("No tax!");
        }else if(gift>999999){
            System.out.println("Tax: "+((gift-1000000)*0.17+142100));
        }else if(gift>199999){
            System.out.println("Tax: "+((gift-200000)*0.15+22100));
        }else if(gift>54999){
            System.out.println("Tax: "+((gift-55000)*0.12+4700));
        }else if(gift>24999){
            System.out.println("Tax: "+((gift-25000)*0.10+1700));
        }else if(gift>4999){
            System.out.println("Tax: "+((gift-5000)*0.08+100));
        }

    }
}

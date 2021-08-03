
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String one = scanner.nextLine();
            if(one.equals("")){
                break;
            }
            String[] s = one.split(" ");
            for(int i = 0; i < s.length; i++){
                System.out.println(s[i]);
            }
        }

    }
}

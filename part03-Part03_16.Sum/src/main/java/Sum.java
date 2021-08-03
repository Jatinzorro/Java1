
import java.util.ArrayList;

public class Sum {

    public static void main(String[] args) {
        
    }
    public static int sum(ArrayList<Integer> numbers){
        int res=0;
        for (int number: numbers) {
        res = res + number;
    }
        
        return res;
    }
        

}

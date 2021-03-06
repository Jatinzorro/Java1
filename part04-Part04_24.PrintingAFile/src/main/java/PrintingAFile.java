
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingAFile {

    public static void main(String[] args) {
        try(Scanner scan=new Scanner(Paths.get("data.txt"))){
            while (scan.hasNextLine()) {
        // we read one line
        String row = scan.nextLine();
        // we print the line that we read
        System.out.println(row);
    }
        } catch (Exception e) {
        System.out.println("Error: "+e.getMessage());
    }

    }
}

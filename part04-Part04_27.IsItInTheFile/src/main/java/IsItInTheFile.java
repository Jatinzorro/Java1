
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        
        int count=1;
        try(Scanner scan=new Scanner(Paths.get(file))){
            System.out.println("Search for:");
            String searchedFor = scanner.nextLine();
            while(scan.hasNext()){
                String val=scan.nextLine();
                if(val.equals(searchedFor)){
                    
                    count=0;
                    break;
                }
            }
        }catch(Exception e){
            System.out.println("Reading the file " + file + " failed.");
        }
        if(count==1){
            System.out.println("Not found.");
        }else if(count==0){
            System.out.println("Found!");
        }
    }
}

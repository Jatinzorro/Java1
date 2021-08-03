
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //System.out.println("File: ");
        String file=scan.nextLine();
        //System.out.println("Team: ");
        String team=scan.nextLine();
        int games=0,win=0,lose=0;
        try(Scanner scanner=new Scanner(Paths.get(file))){
            //System.out.println("first");
            while(scanner.hasNextLine()){
               // System.out.println("Second");
                String line=scanner.nextLine();
                String[] parts=line.split(",");
                if(parts[0].equals(team)){
                    int one=Integer.valueOf(parts[2]);
                    int two=Integer.valueOf(parts[3]);
                    if(one>two){
                        win++;
                    }else{
                        lose++;
                    }
                    games++;
                    //System.out.println("in if");
                }else if(parts[1].equals(team)){
                    int one=Integer.valueOf(parts[3]);
                    int two=Integer.valueOf(parts[2]);
                    if(one>two){
                        win++;
                    }else{
                        lose++;
                    }
                    games++;
                    System.out.println("in else");
                }
                System.out.println(parts[0]+parts[1]+parts[2]+parts[3]);
            }
        }catch(Exception e){
            System.out.println("Error: "+e);
        }
        System.out.println("Games: "+games);
        System.out.println("Wins: "+win);
        System.out.println("Losses: "+lose);
    }

}

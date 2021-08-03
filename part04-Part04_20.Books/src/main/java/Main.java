import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> list=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.print("Title: ");
            String val=scan.nextLine();
            if(val.isEmpty()){
                break;
            }
            System.out.print("Pages: ");
            int page=Integer.valueOf(scan.nextLine());
            System.out.print("Publication year: ");
            String y=scan.nextLine();
            Book book=new Book(val,page,y);
            list.add(book);
        }
        System.out.print("What information will be printed? ");
        String what=scan.nextLine();
        if(what.equals("everything")){
            for(Book i:list){
                System.out.println(i.toString());
            }
        }else{
            for(Book i:list){
                System.out.println(i.getTitle());
            }
        }
    }
}

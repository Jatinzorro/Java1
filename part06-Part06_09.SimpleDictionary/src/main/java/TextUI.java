
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class TextUI {
    private Scanner scan;
    private SimpleDictionary dict;

    public TextUI(Scanner scan, SimpleDictionary dict) {
        this.scan = scan;
        this.dict = dict;
    }
    
    public void start(){
        while(true){
            System.out.println("Command:");
            String command=scan.nextLine();
            
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }else if(command.equals("add")){
                System.out.println("Word:");
                String word=scan.nextLine();
                System.out.println("Translation:");
                String translation=scan.nextLine();
                dict.add(word, translation);
            }else if(command.equals("search")){
                System.out.println("To be translated:");
                String translated=scan.nextLine();
                String returnTranslation=dict.translate(translated);
                if(returnTranslation==null){
                    System.out.println("Word "+translated+" was not found");
                }else{
                    System.out.println(returnTranslation);
                }
            }else{
                System.out.println("Unknown command");
                continue;
            }
        }
        
    }
    
    
}

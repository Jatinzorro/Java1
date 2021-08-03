
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
public class UserInterface {
    private Scanner scanner;
    private GradeRegister register;

    public UserInterface(Scanner scanner, GradeRegister register) {
        this.scanner = scanner;
        this.register = register;
    }

    public void start(){
        readPoints();
        System.out.println("");
        printAverageAll();
        printAveragePassing();
        printPassingPercentage();
        printGradeDistribution();
    }
    
    public void readPoints(){
        System.out.println("Enter point totals, -1 stops:");
        
        while(true){
            int points=Integer.valueOf(scanner.nextLine());
            if(points==-1){
                break;
            }
            
            if(points<0 || points>100){
                continue;
            }
            this.register.addPoints(points);
        }
    }
    
    public void printAverageAll(){
        System.out.println("Point average (all): "+register.averageOfPointsAll());
    }
    
    public void printAveragePassing(){
        String nonePassing="-";
        
        if(register.averagePassingPoints()==0.00){
            System.out.println("Point average (passing): "+nonePassing);
        }else{
            System.out.println("Point average (passing): "+register.averagePassingPoints());
        }
    }
    
    public void printPassingPercentage(){
        System.out.println("Pass percentage: "+register.passPercentage());
    }
    
    public void printGradeDistribution(){
        System.out.println("Grade distribution:");
        int grade=5;
        while(grade>=0){
            int stars=register.totalGradesFromPoints(grade);
            System.out.print(grade+": ");
            printStars(stars);
            System.out.println("");
            grade--;
        }
    }
    
    public static void printStars(int stars){
        while(stars>0){
            System.out.print("*");
            stars--;
        }
    }
    
}

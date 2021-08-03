
import java.util.ArrayList;
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
public class GradeRegister {
    private ArrayList<Integer> points;
    private ArrayList<Integer> passingPoints;
    private ArrayList<Integer> grades;

    public GradeRegister() {
        this.points=new ArrayList<>();
        this.passingPoints=new ArrayList<>();
        this.grades=new ArrayList<>();
    }
    
    public void addPoints(int points){
        this.points.add(points);
        if(points>=50){
            this.passingPoints.add(points);
        }
        this.grades.add(pointsToGrade(points));
    }
    
    
    public double averageOfPointsAll(){
        int lengthAll=this.points.size();
        int total=0;
        
        if(this.points.isEmpty()){
            return -1;
        }else{
            for(Integer point:this.points){
                total+=point;
            }
        }
        return 1.0*total/lengthAll;
    }
    
    
    public double averagePassingPoints(){
        int passingLength=passingPoints.size();
        int total=0;
        
        if(passingPoints.isEmpty()){
            return 0.00;
        }else{
            for(Integer passingPoint:passingPoints){
                total+=passingPoint;
            }
        }
        return 1.0*total/passingLength;
    }
    
    public double passPercentage(){
        int participants=points.size();
        int passing=passingPoints.size();
        double passingRatio=(double)passing/participants;
        
        if(participants==0){
            return -1;
        }else{
            return 100.0*passingRatio;
        }
    }
    
    public static int pointsToGrade(int points){
        int grade=0;
        if(points<50){
            grade=0;
        }else if(points<60){
            grade=1;
        }else if(points<70){
            grade=2;
        }else if(points<80){
            grade=3;
        }else if(points<90){
            grade=4;
        }else{
            grade=5;
        }
        return grade;
    }
    
    public int totalGradesFromPoints(int grade){
        int total=0;
        for(int recieved:this.grades){
            if(recieved==grade){
                total++;
            }
        }
        return total;
    }
    
}

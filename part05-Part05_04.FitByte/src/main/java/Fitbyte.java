/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
import java.util.Formatter;
public class Fitbyte {
    private int age;
    private int restHrate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age=age;
        this.restHrate=restingHeartRate;
    }
    
     public double targetHeartRate(double percentageOfMaximum){
        double max = (206.3-(0.711*this.age));
        
        double res= ((max-this.restHrate)*percentageOfMaximum+this.restHrate);
        
        
        Formatter formatter = new Formatter();
        formatter.format("%.3f", res);
        return Double.valueOf(formatter.toString());
     }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Timer {
    private int hsecond;
    private int second;
    public void advance(){
        this.hsecond+=1;
        if(this.hsecond>=100){
            this.hsecond=0;
            this.second+=1;
            if(this.second>=100){
                this.second=0;
            }
        }  
    }
    
    @Override
    public String toString(){
        String one="";
        String two="";
        if(this.second<10){
        one="0";
        }
        if(this.hsecond<10){
        two="0";
        }        
        return one+this.second+":"+two+this.hsecond;
    }
}

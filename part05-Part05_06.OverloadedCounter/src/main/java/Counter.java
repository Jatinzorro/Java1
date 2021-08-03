/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Counter {
    private int val;
    public Counter(int startValue){
        this.val=startValue;
    }
    public Counter(){
        this.val=0;
    }
    public int value(){
        return this.val;
    }
    public void increase(){
        this.val++;
    }
    public void decrease(){
        this.val--;
    }
    public void increase(int increaseBy){
        if(increaseBy>0){
            this.val+=increaseBy;
        }
    } 
    public void decrease(int decreaseBy){
        if(decreaseBy>0){
            this.val-=decreaseBy;
        }
    }
}


import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jatin Sharma
 */
public class Package {
    private ArrayList<Gift> list;

    public Package() {
        this.list=new ArrayList<>();
    }
    
    public void addGift(Gift gift){
        this.list.add(gift);
    }
    
    public int totalWeight(){
        int sum=0;
        for(Gift g: list){
            sum+=g.getWeight();
        }
        return sum;
    }
    
    
}

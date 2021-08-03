
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
public class Room {
    private ArrayList<Person> person;

    public Room() {
        this.person=new ArrayList<>();
    }
    
    public void add(Person person){
        this.person.add(person);
    }
    
    public boolean isEmpty() {
        return this.person.isEmpty();
    }
    
    public ArrayList<Person> getPersons(){
        return this.person;
    }
    
    public Person shortest(){
        if(this.person.isEmpty()){
            return null;
        }
        
        Person res=this.person.get(0);
        
        for(Person per:person){
            if(res.getHeight()>per.getHeight()){
                res=per;
            }
        }
        return res;
    }
    
     public Person take(){
         if(this.person.isEmpty()){
             return null;
         }
         
         Person take=this.person.get(0);
         for(Person per:person){
             if(take.getHeight()>per.getHeight()){
                 take=per;
             }
         }
         this.person.remove(take);
         return take;
     }
    
}

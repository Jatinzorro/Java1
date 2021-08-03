
public class HealthStation {

    private int count;
    public int weigh(Person person) {
        // return the weight of the person passed as the parameter
        this.count++;
        return person.getWeight();
        
    }
    
    public void feed(Person person){
        int res=person.getWeight()+1;
        person.setWeight(res);
    }
    
    public int weighings(){
        return this.count;
    }

}

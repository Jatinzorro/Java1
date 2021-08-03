
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public int getPrincePerSquare() {
        return this.princePerSquare;
    }
    public int getSquares(){
    return this.squares;
    }
    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    
    public boolean largerThan(Apartment compared){
        if(this.squares>compared.getSquares()){
            return true;
        }else{
            return false;
        }
    }
    
    public int priceDifference(Apartment compared){
        int p1=this.squares*this.princePerSquare;
        int p2=compared.getSquares()*compared.getPrincePerSquare();
        if(p1>p2){
            return p1-p2;
        }else{
            return p2-p1;
        }
    }
    public boolean moreExpensiveThan(Apartment compared){
        int p1=this.squares*this.princePerSquare;
        int p2=compared.getSquares()*compared.getPrincePerSquare();
       if(p1>p2){
           return true;
       }else{
           return false;
       } 
       
    }

}

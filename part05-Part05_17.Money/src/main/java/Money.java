
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition){
        Money newMoney=new Money(this.euros+addition.euros, this.cents+addition.cents);
        return newMoney;
    }
    public boolean lessThan(Money compared){
        if(this.euros()<compared.euros()){
            return true;
        }
        if(this.euros()==compared.euros()){
            if(this.cents()<compared.cents()){
                return true;
            }
        }
        return false;
    }
    
    public Money minus(Money decreaser){
        int subtractEuros=this.euros-decreaser.euros;
        int substrackCents = this.cents-decreaser.cents;
        
        if(subtractEuros>=0){
            if(substrackCents<0){
                subtractEuros-=1;
                substrackCents+=100;
            }  
        }else{
            subtractEuros=0;
            substrackCents=0;
        }
        Money newMoney=new Money(subtractEuros,substrackCents);
        return newMoney;
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}

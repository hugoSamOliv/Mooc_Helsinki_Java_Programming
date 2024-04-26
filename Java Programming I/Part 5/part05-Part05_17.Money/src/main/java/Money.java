
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

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }
    
    public Money plus(Money addition) {
        int newEuro = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        Money newMoney = new Money(newEuro, newCents);
        
        return newMoney;
    }
    
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros) {
            if (this.cents < compared.cents) {
                return true;
            } else {
                return false;
            }
        }
       
        return false;
    }
    
    public Money minus(Money decreaser) {
        
        int newEuro;
        int newCent;
        
        if(!(this.lessThan(decreaser))) {
            newEuro = this.euros - decreaser.euros;
            newCent = this.cents - decreaser.cents;
            
            if (newCent < 0) {
                newEuro--;
                newCent = 100 + this.cents - decreaser.cents;
            }
            
            } else {
                newEuro = 0;
                newCent = 0;
            }
        
        
        Money newMoney = new Money(newEuro, newCent);
        
        return newMoney;
    }
}


public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (compared.squares < this.squares) {
            return true;
        }
        
        return false;
    }
    
    public int priceDifference(Apartment compared) {
        int priceApartment = this.princePerSquare * this.squares;
        int priceCompared = compared.princePerSquare * compared.squares;
        
        int difference = priceApartment - priceCompared;
        
        if (difference >= 0) {
            return difference;
        } else {
            return difference * -1;
        }
    }
    
    public boolean moreExpensiveThan(Apartment compared) {
        int priceApartment = this.princePerSquare * this.squares;
        int priceCompared = compared.princePerSquare * compared.squares;
        
        int difference = priceApartment - priceCompared;
        
        if (difference >= 0) {
            return true;
        } else {
            return false;
        }
    }
}

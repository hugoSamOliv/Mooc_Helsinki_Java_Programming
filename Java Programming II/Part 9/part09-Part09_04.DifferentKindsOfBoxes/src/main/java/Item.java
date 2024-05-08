
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        
        if (obj == this) {
            return true;
        }
        
        Item compared = (Item) obj;
        
        if (this.name.equals(compared.name)) {
            return true;
        }
        
        return false;
    }
    
    @Override
    public int hashCode() {
        return (name.hashCode() * 11) + (17 * 31);
    }
    
    
}

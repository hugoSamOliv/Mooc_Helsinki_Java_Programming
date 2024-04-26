
import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("Name:");
            String itemName = scanner.nextLine();
            
            if (itemName.isEmpty()) {
                break;
            }
            
            items.add(new Item(itemName));
        }
        
        for (Item itemObject : items) {
            System.out.println(itemObject);
        }

    }
}

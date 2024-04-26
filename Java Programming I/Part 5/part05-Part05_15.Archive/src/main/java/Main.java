
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        
        while (true) {
            Boolean checkSameItem = false;
            System.out.println("Identifier? (empty will stop)");
            String identifierInput = scanner.nextLine();
            if (identifierInput.isEmpty()) {
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String nameInput = scanner.nextLine();
            if (nameInput.isEmpty()) {
                break;
            }
            
            Item newItem = new Item(identifierInput, nameInput);
            for (Item itemInList : items) {
                if (itemInList.equals(newItem)) {
                    checkSameItem = true;
                    break;
                }
            }
            
            if (checkSameItem) {
                continue;
            }
            
            items.add(newItem);
        }
        
        for (Item item : items) {
            System.out.println(item.getIdentifier() + ": " + item.getName());
        }

    }
}

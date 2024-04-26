import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Title:");
            String userTitle = scanner.nextLine();
            
            if (userTitle.isEmpty()) {
                break;
            }
            
            System.out.println("Title:");
            int userPages = Integer.parseInt(scanner.nextLine());
            
            System.out.println("Publication year:");
            int userYear = Integer.parseInt(scanner.nextLine());
            
            
            books.add(new Book(userTitle, userPages, userYear));
        }
        
        System.out.println("What information will be printed?");
        String infoToPrint = scanner.nextLine();
        
        for (Book bookInfo : books) {
            if (infoToPrint.equals("everything")) {
                System.out.println(bookInfo);
            } else if (infoToPrint.equals("name")) {
                System.out.println(bookInfo.getTitle());
            }
        }
        
    }
}

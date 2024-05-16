import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        
        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                break;
            }
            
            System.out.println("Input the age recommendation:");
            int age = Integer.parseInt(scanner.nextLine());
            
            books.add(new Book(name, age));
        }
        
        long length = books.stream()
                        .count();
        
        System.out.println(length + " books in total.");
        
        Comparator<Book> comparator = Comparator
                                        .comparing(Book::getAgeRecommendation)
                                        .thenComparing(Book::getName);
        
        Collections.sort(books, comparator);
        
        System.out.println("Books:");;
        books.stream()
                .forEach(book -> System.out.println(book.getName() + " (recommended for " + book.getAgeRecommendation() + " year-olds or older)"));
    }

}

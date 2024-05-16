
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = readBooks("test.txt");
        books.stream()
                .forEach(book -> System.out.println(book.getAuthor() + ": " + book.getName() + "; Pages: " + book.getPagecount() + "; Publication Year: " + book.getPublishingYear()));
    }

    public static List<Book> readBooks(String file) {
        List<Book> books = new ArrayList<>();
        
        try {
            Files.lines(Paths.get(file))
                    .map(bookInfo -> bookInfo.split(","))
                    .filter(bookInfo -> bookInfo.length >= 4)
                    .map(bookInfo -> new Book(bookInfo[0], Integer.parseInt(bookInfo[1]), Integer.parseInt(bookInfo[2]), bookInfo[3]))
                    .forEach(bookInfo -> books.add(bookInfo));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        
        return books;
    }
}

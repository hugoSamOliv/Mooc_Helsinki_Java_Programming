
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Searching {

    public static void main(String[] args) {
        // The program below is meant for testing the search algorithms you'll write
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));     
        }
        

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (linearSearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");
        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");
        if (binarySearchId < 0) {
            System.out.println("Book not found");
        } else {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int smallestIndexFrom(ArrayList<Book> list, int start) {
        int smallestBookId = list.get(start).getId();
        int smallestBookIndex = start;
        
        for (int i = start; i < list.size(); i++) {
            if (smallestBookId > list.get(i).getId()) {
                smallestBookId = list.get(i).getId();
                smallestBookIndex = i;
            }
        }
        
        return smallestBookIndex;
    }
    
    public static void swap(ArrayList<Book> books, int firstIndex, int secondIndex) {
       int tempId = books.get(firstIndex).getId();
       String tempName = books.get(firstIndex).getName();     
       
       books.get(firstIndex).setId(books.get(secondIndex).getId());
       books.get(secondIndex).setId(tempId);
       
       books.get(firstIndex).setName(books.get(secondIndex).getName());
       books.get(secondIndex).setName(tempName);   
    }
    
    public static void selectionSort(ArrayList<Book> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                break;
            }
            int numberOnIndex = i;
            int smallIndex = smallestIndexFrom(list, i);
            if (list.get(i).getId() > list.get(smallIndex).getId()) {
                swap(list, numberOnIndex, smallIndex);
            }           
        }      
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId) {
        
        // selectionSort(books);
        
        int begin = 0;
        int end = books.size() - 1;
        
        while (begin <= end) {
            int middle = end + begin / 2;
            
            if (books.get(middle).getId() == searchedId) {
                return middle;
            }
            
            if (books.get(middle).getId() < searchedId) {
                begin = middle + 1;
            }
            
            if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
            }
        }
        
        return -1;
    }
}


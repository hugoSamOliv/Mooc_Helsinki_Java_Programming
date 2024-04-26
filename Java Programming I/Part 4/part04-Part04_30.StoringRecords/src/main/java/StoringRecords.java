
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner scanFile = new Scanner(Paths.get(file));) {
            while (scanFile.hasNextLine()) {
                String person = scanFile.nextLine();
                
                String[] info = person.split(",");
                
                String name = info[0];
                int age = Integer.parseInt(info[1]);
                
                persons.add(new Person(name, age));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        return persons;

    }
}

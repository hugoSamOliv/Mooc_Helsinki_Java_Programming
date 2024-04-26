import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int countNumberInRange = 0;
        
        try (Scanner scanFile = new Scanner(Paths.get(file))) {
            while(scanFile.hasNextLine()) {
                list.add(Integer.parseInt(scanFile.nextLine()));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        for (Integer number : list) {
            if (number >= lowerBound && number <= upperBound) {
                countNumberInRange++;
            }
        }
        
        System.out.println("Numbers: " + countNumberInRange);
    }

}

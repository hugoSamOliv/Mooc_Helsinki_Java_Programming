import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int stringLength = 0;
        String greatestString = "";
        int sumOfYears = 0;
        int denominator = 0;
        
        while (!text.equals("")) {
            String[] nameAndBirth = text.split(",");
            
            if (nameAndBirth[0].length() > stringLength) {
                stringLength = nameAndBirth[0].length();
                greatestString = nameAndBirth[0];
            }
            
            sumOfYears += Integer.valueOf(nameAndBirth[1]);
            denominator++;
            
            text = scanner.nextLine();
        }
        
        System.out.println("Longest name: " + greatestString);
        System.out.println("Average of the birth years: " + ((double) sumOfYears / denominator));
    }
}

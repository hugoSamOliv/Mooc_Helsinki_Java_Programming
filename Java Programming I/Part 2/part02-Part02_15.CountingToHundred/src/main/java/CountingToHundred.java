
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minValue = Integer.valueOf(scanner.nextLine());
        for (int i = 100; minValue <= i; minValue++) {
            System.out.println(minValue);
        }
    }
}

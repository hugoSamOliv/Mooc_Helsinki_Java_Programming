

public class FromOneToParameter {

    public static void main(String[] args) {
        
        printUntilNumber(5);
    }

    public static void printUntilNumber(int numberOfTimes) {
        for (int i = 1; i <= numberOfTimes; i++) {
            System.out.println(i);
        }
    }
}

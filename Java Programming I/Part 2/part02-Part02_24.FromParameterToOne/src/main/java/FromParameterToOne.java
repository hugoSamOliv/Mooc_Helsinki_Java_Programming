

public class FromParameterToOne {

    public static void main(String[] args) {

        printFromNumberToOne(5);
    }

    public static void printFromNumberToOne(int numberOfTimes) {
        for (int i = 1; i <= numberOfTimes; numberOfTimes--) {
            System.out.println(numberOfTimes);
        }
    }
}

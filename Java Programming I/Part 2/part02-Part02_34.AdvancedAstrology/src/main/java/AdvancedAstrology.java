
public class AdvancedAstrology {

    public static void printSpaces(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print(" ");
        }
    }
    
    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printTriangle(int size) {
        for (int i = 0; i < size; i++) {
            printSpaces(size - i - 1);
            printStars(i + 1);
        }
    }

    public static void christmasTree(int height) {
        int counter = 0;
        for (int i = 0; i < height; i++) {
            printSpaces(height - i - 1);
            printStars(i + 1 + counter);
            counter++;
        }

        for (int line = 0; line < 2; line++) {
            printSpaces(counter - 2);
            System.out.println("***");
        }
    }
    

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

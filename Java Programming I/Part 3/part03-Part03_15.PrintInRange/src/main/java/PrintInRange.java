
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<>();
        
        intList.add(3);
        intList.add(2);
        intList.add(6);
        intList.add(-1);
        intList.add(5);
        intList.add(1);
        
        System.out.println("The numbers in the range [0, 5]");
        printNumbersInRange(intList, 0, 5);
        
        System.out.println("The numbers in the range [3, 10]");
        printNumbersInRange(intList, 3, 10);
    }
    
    public static void printNumbersInRange(ArrayList<Integer> list, int lowerLimit, int upperLimit) {
        for (Integer num : list) {
            if (num >= lowerLimit && num <= upperLimit) {
                System.out.println(num);
            }
        }
    }
}

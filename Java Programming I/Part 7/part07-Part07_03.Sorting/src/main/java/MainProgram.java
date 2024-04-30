
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
        
        sort(array);
    }

    public static int smallest(int[] array) {
        int smallest = array[0];
        for (int number : array) {
            if (number < smallest) {
                smallest = number;
            }
        }
        
        return smallest;
    }
    
    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int indexOfSmallest = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    } 
    
    public static int indexOfSmallestFrom(int[] array, int start) {
        int smallest = array[start];
        int indexOfSmallest = start;
        for (int i = start; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                indexOfSmallest = i;
            }
        }
        
        return indexOfSmallest;
    }
    
    public static void swap(int[] array, int index1, int index2) {
           int temp = array[index1];   
           array[index1] = array[index2];
           array[index2] = temp;
    }
    
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int numberOnIndex = array[i];
            int smallIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallIndex);
            
            System.out.print("[");
            int indexOfPrintingNumbers = 0;
            for (Integer number : array) {
                if (array.length - 1 == indexOfPrintingNumbers) {
                    System.out.print(number);
                    break;
                }
                
                System.out.print(number + ", ");
                indexOfPrintingNumbers++;
            }
            System.out.print("]");
            System.out.println();
        }
    }
}

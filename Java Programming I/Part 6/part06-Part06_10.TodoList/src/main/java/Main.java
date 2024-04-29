
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* TodoList list = new TodoList();
        list.add("one");
        list.add("two");
        list.add("three");
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
        list.print(); */
        
        TodoList list = new TodoList();
        list.add("one");
        list.add("two");
        list.add("three");
        Scanner scanner = new Scanner(System.in);

        UserInterface ui = new UserInterface(list, scanner);
        ui.start();
    }
}



public class MainProgram {

    public static void main(String[] args) {
        
        Checker checker = new Checker();
        
        System.out.println(checker.isDayOfWeek("sun"));
        System.out.println(checker.isDayOfWeek("mon"));
        System.out.println(checker.isDayOfWeek("sat"));
        System.out.println(checker.isDayOfWeek("abc"));
        
        System.out.println(checker.allVowels("aei"));
        System.out.println(checker.allVowels("aeb"));
        
        System.out.println(checker.timeOfDay("22:10:40"));
    }
}

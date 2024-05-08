import java.util.ArrayList;
import java.util.List;

public class mainProgram {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("ok");
        names.add("cool");
        names.add("nice");
        
        System.out.println(returnSize(names));

    }

    public static int returnSize(List<String> list) {
        return list.size();
    }
}

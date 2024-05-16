
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        readLiteracyRates("literacy.csv");
    }
    
    public static void readLiteracyRates(String file) {
        try {
            Files.lines(Paths.get(file))
                    .map(info -> info.split(","))
                    .map(info -> {
                        info[2] = info[2].trim();
                        String[] gender = info[2].split(" ");
                        info[2] = gender[0];
                        return info;
                    })
                    .filter(info -> info.length >= 6)
                    .sorted((previousLine, nextLine) -> {
                        int result = (int) ((Double.parseDouble(previousLine[5]) - Double.parseDouble(nextLine[5])) * 1000000);
                        return result;             
                    })
                    .forEach(line -> System.out.println(line[3] + " (" + line[4] + "), " + line[2] + ", " + line[5]));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

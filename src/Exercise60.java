import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise60 {
    public static void main(String[] args) {
        try {
            Scanner scanner= new Scanner(Paths.get("data.txt"));
            while (scanner.hasNextLine()){
                String input= scanner.nextLine();
                System.out.println(input);
            }

        } catch (Exception e) {
            System.out.println("line not found");
        }
    }
}
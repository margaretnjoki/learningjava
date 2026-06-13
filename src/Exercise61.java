import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Exercise61 {
    public static void main(String[] args) {
        try {
            Scanner scanner1=new Scanner(System.in);
            System.out.println("which file should have its content printed? ");
            String userFile = scanner1.nextLine();
            Scanner scanner= new Scanner(Paths.get(userFile));
            while (scanner.hasNextLine()){
                String input= scanner.nextLine();
                System.out.println(input);
            }

        } catch (Exception e) {
            System.out.println("file not found");
        }
    }
}
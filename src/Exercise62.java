import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise62 {
    public static void main(String[] args) {
        ArrayList<String>guests=new ArrayList<>();

        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the name of the file: ");
        String filename= scanner.nextLine();

        try {
            Scanner fileScanner= new Scanner(Paths.get(filename));

            while (fileScanner.hasNextLine()) {
                String input = fileScanner.nextLine();
                guests.add(input);
            }


            while (true){
                System.out.println("enter the names or empty to quit");

                String input= scanner.nextLine();

                if (input.isEmpty()){
                    break;
                }
                if (guests.contains(input)){
                    System.out.println("the name is on the list.");
                }else {
                    System.out.println("the name is not on the list.");
                }

            }

        } catch (Exception e) {
            System.out.println("error message: file not found ");
        }
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise51 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the input");
        String input= scanner.nextLine();
        ArrayList<String> values= new ArrayList<>();
        while (true){

            if (input .equals("-1")){
                break;
            }
            values.add(input);
        }

        System.out.println("search for ? " + values.get(values.indexOf(input)));
    }
}

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise48 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the input");
        ArrayList<String> values= new ArrayList<>();
        while (true){
            String input= scanner.nextLine();
            if (input .equals("-1")){
                break;
            }
            values.add(input);
        }
        System.out.println(values);
    }
}

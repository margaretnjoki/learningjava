import java.util.ArrayList;
import java.util.Scanner;

public class Exercise45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        ArrayList<String> values = new ArrayList<>();
        while(true){
            String input= scanner.nextLine();
            if(input.isEmpty()){
                break;
            }
            values.add(input);
        }
        System.out.println("In Total: " + values.size());
    }
}

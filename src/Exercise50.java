import java.util.ArrayList;
import java.util.Scanner;

public class Exercise50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the input");
        ArrayList<String> values = new ArrayList<>();

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }
            values.add(input);
            while (true) {
                int greatest = Integer.parseInt(scanner.nextLine());
                for (int i = greatest; i > values.size(); i++) {
                    int number = Integer.parseInt(scanner.nextLine());
                    values.get(i);
                    if (greatest > number) {
                        greatest = number;
                    }
                }
                values.add(input);
                System.out.println("The greatest no is: " + greatest);
            }

        }
    }
}

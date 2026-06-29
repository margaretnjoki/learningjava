import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> numbers = new ArrayList<>();

        while (true) {
            System.out.println("Enter the number: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            numbers.add(input);
        }

        System.out.println("which average do you want to be calculate? ");
        System.out.println("positive numbers,press p: ");
        System.out.println("negative numbers, press n: ");

        String choice = scanner.nextLine();

        if (choice.equals("p")) {
            double average = numbers.stream()
                    .mapToInt(nums -> Integer.valueOf(nums))
                    .filter(s -> s > 0)
                    .average()
                    .getAsDouble();

        } else {
            double average = numbers.stream()
                    .mapToInt(nums -> Integer.valueOf(nums))
                    .filter(s -> s < 0)
                    .average()
                    .getAsDouble();


            System.out.println(average);
        }


    }
}

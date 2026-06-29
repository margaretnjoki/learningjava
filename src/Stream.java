import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Stream {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List<String> numbers = new ArrayList<>();

        while (true){
            System.out.println("enter the number: ");
            String input=scanner.nextLine();
            if (input.equals("end")){
                break;
            }
            numbers.add(input);

        }
        double average = numbers.stream()
                .mapToInt(value -> Integer.valueOf(value))
                .average()
                .getAsDouble();
        System.out.println(average);

    }

}

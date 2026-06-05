import java.util.Scanner;
public class Exercise18{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int integer = Integer.valueOf(scanner.nextLine());
        if (integer > 0) {
            System.out.println("The number is positive");
        }
        else{
            System.out.println("The number is not positive");
        }
    }
}
import java.util.Scanner;

public class Exercise28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first integer");
        int firstInteger= Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the second integer");
        int secondInteger= Integer.valueOf(scanner.nextLine());
         int sum= firstInteger + secondInteger;
         double squareRoot= Math.sqrt(sum);
        System.out.println(squareRoot);
    }
}

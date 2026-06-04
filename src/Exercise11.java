import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Give a String:");
        String string= String.valueOf(scanner.nextLine());
        System.out.println("Give an integer:");
        int integer=Integer.valueOf(scanner.nextLine());
        System.out.println("Give a double");
        double doub=Double.valueOf(scanner.nextLine());
        System.out.println("give a boolean:");
        boolean bool= Boolean.valueOf(scanner.nextLine());
        System.out.println("you gave the String " + string);
        System.out.println("you gave the integer " + integer);
        System.out.println("you gave the boolean " + bool);
        System.out.println("you gave the double " + doub);
    }
}

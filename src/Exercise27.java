import java.util.Scanner;

public class Exercise27 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an integer");
        int integer= Integer.valueOf(scanner.nextLine());
        int Result= integer * integer;
        System.out.println(Result);
    }
}

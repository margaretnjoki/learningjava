import java.util.Scanner;
public class Exercise15{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give the first number:");
        int first= Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        int second= Integer.valueOf(scanner.nextLine());
        int add= first + second;
        int sub= first - second;
        int mul= first * second;
        double divide= (double) first / second;
        System.out.println(first + " + "  +second + " = " + add);
        System.out.println(first  + " - " + second + " = " + sub);
        System.out.println(first + " * "  +second + " = " + mul);
        System.out.println(first + " / " + second + " = " + divide);
    }
}


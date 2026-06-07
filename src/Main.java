import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        greet(2);
    }

    public static void greet(int endOfLoop) {
        for (int i=0; i< endOfLoop; i++ ){
            System.out.println("good morning");
        }
    }

    public static void addTwoNumber(int a, int b) {
        System.out.println("Sum="+(a+b));
    }
}
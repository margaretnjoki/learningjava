import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();
            int choice = Integer.parseInt(scanner.nextLine());

            if (choice == 5) {
                System.out.println("exit");
                continue;
            }


            processCalculation(choice);
        }
    }

    public static void processCalculation(int choice) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st no : ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter 2nd no : ");
        int num2 = Integer.parseInt(scanner.nextLine());
        result(choice, num1, num2);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double mul(double a, double b) {
        return a * b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static void menu() {
        System.out.println("available operations : ");
        System.out.println("1. Add");
        System.out.println("2. Sub");
        System.out.println("3. Mul");
        System.out.println("4. Div");
        System.out.println("5. Exit");
        System.out.println("Enter a choice between 1 and 5");
    }

    public static void result(int choice, double num1, double num2) {
        if (choice == 1) {
            System.out.println(num1 + " + " + num2 + " = " + add(num1, num2));
        } else if (choice == 2) {
            System.out.println(num1 + " - " + num2 + " = " + sub(num1, num2));
        } else if (choice == 3) {
            System.out.println(num1 + " * " + num2 + " = " + mul(num1, num2));
        } else if (choice == 4) {
            if (num2 == 0) {
                System.out.println("Error: impossible to divide by zero");
            } else {
                System.out.println(num1 + " / " + num2 + " = " + div(num1, num2));
            }
        }
    }
}




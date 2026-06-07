import java.util.Scanner;

public class Exercise38 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a no");
        int num=Integer.valueOf(scanner.nextLine());
        for(int i= 1; i<= num; i++){
            printText();
        }
    }

    public static void printText () {
        System.out.println("I have a hole");
    }
}

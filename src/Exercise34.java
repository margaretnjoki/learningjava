import java.util.Scanner;

public class Exercise34 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a number");
        int num=Integer.valueOf(scanner.nextLine());
        for(int i= num; i<=100; i++){
            System.out.print(i + " ");
        }
    }
}

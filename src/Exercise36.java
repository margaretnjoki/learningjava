import java.util.Scanner;
public class Exercise36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int number=Integer.valueOf(scanner.nextLine());
        int result= 0;
        for(int i= 1; i<= number; i++){
            result= result + i;
        }
        System.out.println(result);
    }
}

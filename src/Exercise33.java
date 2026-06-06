import java.util.Scanner;

public class Exercise33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int num=Integer.valueOf(scanner.nextLine());
       for(int i= 0; i< num; i++){
            System.out.print(i);
        }
    }
}
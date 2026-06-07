import java.util.Scanner;

public class Exercise37 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=Integer.valueOf(scanner.nextLine());
        int result=1;
        for( int i=1; i<=num; i++ ){
            result=result * i;
        }
        System.out.println(result);
    }
}

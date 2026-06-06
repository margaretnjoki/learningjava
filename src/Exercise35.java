import java.util.Scanner;

public class Exercise35 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Where to?");
        int max= Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int min= Integer.valueOf(scanner.nextLine());
       for(int i=min; i <= max; i++){

           System.out.print(i + " ");
       }
    }
}

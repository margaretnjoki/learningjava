import java.util.Scanner;

public class Exercise21 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the first String");
        String firstString= scanner.nextLine();
        System.out.println("Enter the second String");
        String secondString=scanner.nextLine();
        if(firstString.equals(secondString)){
            System.out.println("Same");
        }
        else {
            System.out.println("Different");
        }
    }
}

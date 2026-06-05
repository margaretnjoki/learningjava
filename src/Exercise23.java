import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a number");
        int theNumber=  Integer.valueOf(scanner.nextLine());
        if(theNumber % 2 == 0){
            System.out.println("number " + theNumber  +" is even ");
        }
        else{
            System.out.println("number " + theNumber +" is odd");
        }

    }
}

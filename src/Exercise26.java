import java.util.Scanner;

public class Exercise26 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the year");
        int year= Integer.valueOf(scanner.nextLine());
        if (year % 4 ==0 && year %  100==0  && year % 400==0){
            System.out.println("The year " + year + " is a leap year");
        }
        else{
            System.out.println("the year " + year + " is not a leap year");
        }
    }
}

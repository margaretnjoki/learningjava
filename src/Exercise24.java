import java.util.Scanner;

public class Exercise24 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=Integer.valueOf(scanner.nextLine());
        if (number % 3== 0){
            System.out.println("Fizz");
        }
        else if(number % 5 == 0){
            System.out.println("buzz");
        }
        else if(number % 3 == 0 && number % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else{
            System.out.println(number);
        }

    }
}

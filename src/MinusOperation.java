import java.util.Scanner;

public class MinusOperation extends Operation {

    public MinusOperation(String name){
        super(name);

    }


    @Override
    public void execute(Scanner scanner) {
        System.out.println("Enter the first no : ");
        int num1=Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the second no:");
        int num2=Integer.valueOf(scanner.nextLine());
        int difference=num1-num2;
        System.out.println(difference);

    }

    @Override
    public String toString() {
        return super.toString() ;
    }
}

import java.util.Scanner;

public class PlusOperation extends Operation{

    public PlusOperation(String name){
        super(name);

    }

    @Override
    public void execute(Scanner scanner) {
        System.out.println("Enter the first no: ");
        int num1=Integer.valueOf(scanner.nextLine());
        System.out.println("Enter the second no: ");
        int num2= Integer.valueOf(scanner.nextLine());

        int sum=num1 + num2;
        System.out.println(sum);


    }
}

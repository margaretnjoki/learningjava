import java.util.ArrayList;
import java.util.Scanner;

public class MainOperation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList <Operation>operations=new ArrayList<>();
        operations.add(new PlusOperation("plus"));
        operations.add(new MinusOperation("minus"));
        for (Operation  op :operations){
            System.out.println("Running: " + op.getName());
            op.execute(scanner);
            System.out.println(op);
        }


    }
}

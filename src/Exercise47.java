import java.util.ArrayList;
import java.util.Scanner;

public class Exercise47 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the input");
        ArrayList<String> values= new ArrayList<>();
        while (true){
            String input= scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            values.add(input);
        }
        if (!values.isEmpty()){
            System.out.println("the first value is : " + values.get(0));
            System.out.println("the last value is : " + values.get(values.size() -1));
        }

    }
}

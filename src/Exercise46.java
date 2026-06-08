import java.util.ArrayList;
import java.util.Scanner;

public class Exercise46 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter inputs : ");
        ArrayList<String> numbers = new ArrayList<>();
        while(true){
            String input= scanner.nextLine();
            if (input.isEmpty()){
                break;
            }
            numbers.add( input);
        }
        if (!numbers.isEmpty()){
            System.out.println("the last number is : " + numbers.get(numbers.size() - 1));

        }



    }
}

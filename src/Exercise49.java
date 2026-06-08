import java.util.ArrayList;
import java.util.Scanner;

public class Exercise49 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter the input");
        ArrayList<String> values= new ArrayList<>();
        while (true){
            String input= scanner.nextLine();
            if (input .equals("-1")){
                break;
            }
            values.add(input);
        }
        System.out.println("from where? ");
        int start= Integer.parseInt(scanner.nextLine());
        System.out.println("where to? ");
        int end= Integer.parseInt(scanner.nextLine());
        for (int i= start; i<=end; i++){
            System.out.println(values.get(i));
        }

    }
}

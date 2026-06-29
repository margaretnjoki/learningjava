import java.awt.desktop.SystemEventListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        List <String> inputs=new ArrayList<>();

        System.out.println("enter the number: ");
        while (true){
            String num= scanner.nextLine();
            if (num.equals("")){
                break;
            }
            inputs.add(num);
        }
        System.out.println(inputs);
    }
}

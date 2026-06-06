import java.util.Scanner;

public class Exercise30 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
    while (true){
        System.out.println("Give a number");
        int number= Integer.valueOf(scanner.nextLine());
        if(number == 4){
            break;
        }
    }
    }
}

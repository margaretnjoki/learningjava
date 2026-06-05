import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Password?");
        String passWord= scanner.nextLine();
        if(passWord. equals("Caput Draconis")){
            System.out.println("Welcome!");
        }
        else {
            System.out.println("Off with you!");
        }

    }
}

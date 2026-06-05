import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How old are you? ");
        int age= Integer.valueOf(scanner.nextLine());
        if(age>=0  && age <=120){
            System.out.println("Ok");
        }
        else if(age<0){
            System.out.println("Impossible!");
        }
        else if(age > 120){
            System.out.println("Impossible!");
        }
    }
}

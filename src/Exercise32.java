import java.util.Scanner;

public class Exercise32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalNegativeNumbers=0;
        while (true){
            System.out.println("give a number");
            int num= Integer.valueOf(scanner.nextLine());
            if(num == 0){
                break;
            }
           else if(num < 0){
                totalNegativeNumbers=totalNegativeNumbers + 1;
            }

        }
        System.out.println("total number of negative numbers = " + totalNegativeNumbers);
    }
}

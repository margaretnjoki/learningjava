import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first");
        System.out.println("What is the main character called?");
        String name= scanner.nextLine();
        System.out.println("What is their job?");
        String job= scanner.nextLine();
        System.out.println("Here is the story");
        System.out.println("Once Upon a time there was Bob, who was a builder.");
        System.out.println("On the way to work, Bob reflected on life");
        System.out.println("Perhaps Bob will not be a builder forever.");
    }
}

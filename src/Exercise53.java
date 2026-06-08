import java.util.ArrayList;

public class Exercise53 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(2);
        numbers.add(6);
        numbers.add(-1);
        int sum = 0;
        for (int number: numbers) {
            sum = sum + number;
        }
        System.out.println(sum);

    }
}

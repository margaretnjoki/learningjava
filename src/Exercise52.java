import java.util.ArrayList;

public class Exercise52 {
    public static void main(String[] args) {
        ArrayList<String> values = new ArrayList<>();

        values.add("First");
        values.add("Second");
        values.add("Third");
        values.add("fourth");

        System.out.println(values);

       values. removeLast();
        values.removeLast();

        System.out.println(values);
    }
}

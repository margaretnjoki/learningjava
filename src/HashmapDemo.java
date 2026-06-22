import java.util.HashMap;

public class HashmapDemo {
    public static void main(String[] args) {
        HashMap<String, String> names =new HashMap<>();
        names.put("margaret", "maggie");
        names.put("kanyi", "nini");
        names.put("munge", "mungs");

        System.out.println(names.get("kanyi"));


    }
}

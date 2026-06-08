import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("maggie");
        System.out.println(list.get(1));
    }

    public static double  average(int a, int b, int c){
        double average= (a + b+ c)/ (double)3;
        return average;
    }

}

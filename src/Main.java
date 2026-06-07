public class Main {
    public static void main(String[] args) {
        System.out.println(average(2,4,6));
    }

    public static double  average(int a, int b, int c){
        double average= (a + b+ c)/ (double)3;
        return average;
    }
}
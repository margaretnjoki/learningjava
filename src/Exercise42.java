public class Exercise42 {
    public static void main(String[] args) {
        numbersThatAreEven(1, 20);
    }
    public static void numbersThatAreEven( int beg, int end){
        for (int i=beg; i<= end; i++){
            if(i % 2==0){
                System.out.println(i);
            }
        }
    }
}

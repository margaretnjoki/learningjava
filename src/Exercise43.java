public class Exercise43 {
    public static void main(String[] args) {
        System.out.println( "smallest: " + smallest(2,7));

    }

    public static int smallest(int num1, int num2){
        if(num1 < num2){
           return num1;
        }
        else{
            return num2;
        }

    }
}

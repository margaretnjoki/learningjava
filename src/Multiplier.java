public class Multiplier {
    private int number;


    public Multiplier(int number){
        this.number= number;
    }

    public int multiply(int num){
        return this.number * num;
    }
}
 class MainMultiplier{
     public static void main(String[] args) {
         Multiplier multiplier= new Multiplier(4);
         int value=multiplier.multiply(2);
         System.out.println(value);

         Multiplier number3= new Multiplier(6);
         System.out.println(number3.multiply(4) );
     }

}

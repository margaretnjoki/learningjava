public class DecreasingCounter {
    private int value;

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        this.value= this.value - 1;

    }
}
 class Counter{
     public static void main(String[] args) {
         DecreasingCounter  counter=new DecreasingCounter(4);
         counter.printValue();
         counter.decrement();
         counter.printValue();
     }


}



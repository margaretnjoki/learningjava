import java.util.Arrays;
public class Exercise55 {
    public static void main(String[] args) {
        int [] numbers= {4,6,2,7,9,5};
        for (int num: numbers){
            System.out.println(num);
        }
        System.out.println("two indices to swap: ");
       int temp=numbers[0];
        numbers[0]=numbers[2];
        numbers[2]= temp;
        System.out.println(Arrays.toString(numbers));
    }
}

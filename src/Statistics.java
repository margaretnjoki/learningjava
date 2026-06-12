import java.util.Scanner;

public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count=0;
        this.sum= 0;
    }

    public void  addNumber(int number) {
        this.count ++;
        this.sum= this.sum + number;
    }

    public int getCount() {
        return this.count;
    }

    public int getSum(){
       return this.sum;
    }

    public double getAverage(){
            if (this.count== 0){
                return 0.0;
            }
            return this.sum/ (double)this.count;
    }
}


class StatisticsProgram {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics total= new Statistics();
        Statistics even= new Statistics();
        Statistics odd= new Statistics();
        System.out.println("Enter the numbers: ");
        for (int number = scanner.nextInt(); number != -1; number = scanner.nextInt()) {
            statistics.addNumber(number);

            if (number % 2 == 0) {
                even.addNumber(number);
            } else {
                odd.addNumber(number);
            }
        }
        System.out.println("sum of input values: " + statistics.getSum());
        System.out.println("sum of even numbers: " + even.getSum());
        System.out.println("sum of odd numbers: " + odd.getSum());

        System.out.println();

        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);
        statistics.addNumber(2);
        System.out.println("Count: " + statistics.getCount());
        System.out.println("sum: " + statistics.getSum());
        System.out.println("Average: " + statistics.getAverage());



    }
}
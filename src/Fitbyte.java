import java.util.regex.PatternSyntaxException;

public class Fitbyte {
private int age;
private int restingHeartRate;


    public Fitbyte (int age, int restingHeartRate){
        this.age=age;
        this.restingHeartRate=restingHeartRate;

    }

    public double targetHeartRate(double percentageOfMaximum){
        double maximum= 206.3 - (0.711 * this.age)  ;
        return maximum * percentageOfMaximum;
    }
}
class FitByteMain {
    public static void main(String[] args) {
        Fitbyte fitbyte = new Fitbyte(30, 60);

        double percentage = 0.5;

        while (percentage < 1.0) {
            double target = fitbyte.targetHeartRate(percentage);
            System.out.println("Target " + (percentage * 100) + "% of maximum: " + target);
            percentage = percentage + 0.1;

        }
    }
}

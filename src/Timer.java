public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;


    public Timer(){
        this.hundredths=new ClockHand(100);
        this.seconds=new ClockHand(60);
    }


    public void advance(){
         this.hundredths.advance();

        if (this.hundredths.value() == 0) {
            this.seconds.advance();
        }
    }


    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }
}

class MainTimer{
    public static void main(String[] args) {
        Timer timer= new Timer();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {

            }
        }
    }
}


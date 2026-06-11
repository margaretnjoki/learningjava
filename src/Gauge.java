public class Gauge {
    private int value;

    public Gauge(int value) {
        this.value = 0;
    }

    public void increase() {
        while (this.value < 5) {
            System.out.println(value);
           this.value = this.value + 1;
        }
    }


    public void decrease() {
        if (this.value > 0) {
            this.value = this.value - 1;
        }
    }

    public int getValue() {
        return this.value;
    }

    public boolean full() {
        return this.value == 5;
    }
}


class DecreaseMain {
    public static void main(String[] args) {
        Gauge gauge = new Gauge(3);

        while (!gauge.full()) {
            System.out.println("Not full! Value: " + gauge.getValue());
            gauge.increase();
        }
        System.out.println("Full! Value: " + gauge.getValue());
        gauge.decrease();
        System.out.println("Not full! Value: " + gauge.getValue());

    }
}

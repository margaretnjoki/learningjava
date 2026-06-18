public class CounterClass {
    private int value;

    public CounterClass(int startValue) {
        this.value = startValue;
    }

    public CounterClass() {
        this.value = 0;
    }

    public int value() {
        return this.value;
    }

    public void increase() {
        this.value = this.value + 1;
    }

    public void decrease() {
        this.value = this.value - 1;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {
            return;
        }

        this.value = this.value + increaseBy;
    }

    public void decrease(int decreaseBy) {
        if (decreaseBy < 0) {
            return;
        }
        this.value = this.value - decreaseBy;
    }

    public String toString() {
        return String.valueOf(this.value);

    }
}

class CounterClassMain {
    public static void main(String[] args) {
        CounterClass counter = new CounterClass();
        System.out.println(counter);
    }
}

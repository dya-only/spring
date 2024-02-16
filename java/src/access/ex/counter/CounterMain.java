package access.ex.counter;

public class CounterMain {
    public static void main(String[] args) {
        MaxCounter counter = new MaxCounter(2);

        counter.increment();
        counter.increment();

        counter.increment();

        System.out.println("count = " + counter.getCount());
    }
}

package access.ex.counter;

public class MaxCounter {
    private int count;
    private int max;

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값입니다.");
            return;
        }

        count++;
    }

    public int getCount() {
        return count;
    }
}

package static1.ex.math;

public class MathArrayUtil {
    private MathArrayUtil() {}  // private 생성자를 선언 (인스턴스 생성을 막기 위함)

    public static int sum(int[] values) {
        int sum = 0;

        for (int value : values)
            sum += value;

        return sum;
    }

    public static int avg(int[] values) {
        return sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];

        for (int value : values)
            if (value < min)
                min = value;

        return min;
    }

    public static int max(int[] values) {
        int max = values[0];

        for (int value : values)
            if (value > max)
                max = value;

        return max;
    }
}
package static1.ex.math;

import static static1.ex.math.MathArrayUtil.*;

public class MathArrayUtilMain {
    public static void main(String[] args) {
        int[] values = { 1, 2, 3, 4, 5 };
        System.out.println("sum: "+ sum(values));
        System.out.println("avg: "+ avg(values));
        System.out.println("min: "+ min(values));
        System.out.println("max: "+ max(values));
    }
}

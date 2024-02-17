package static1.ex.car;

public class Car {
    private static String[] carNames = new String[10];
    private static int count;

    public Car(String name) {
        carNames[count++] = name;
    }

    public static void showTotalCars() {
        for (int i = 0; i < count; i++) {
            System.out.println("차량구입, 이름: " + carNames[i]);
        }
        System.out.println("구매한 차량 수: " + count);
    }
}
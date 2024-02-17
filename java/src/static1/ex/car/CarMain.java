package static1.ex.car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car("Ferrari");
        Car car2 = new Car("Audi");
        Car car3 = new Car("Benze");

        Car.showTotalCars();
    }
}

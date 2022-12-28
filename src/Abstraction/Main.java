package Abstraction;

public class Main {
    public static void main(String[] args) {
        // abstract = abstract classes cannot be instantiated, but they can have a sublcass.
        // Abstract methods are declared without an implementation.

        // Vehicle vehicle = new Vehicle(); Cannot declare instance of Vehicle
        Car car = new Car();

        car.go();
    }
}

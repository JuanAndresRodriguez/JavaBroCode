package ToStringMethod;

public class Main {
    public static void main(String[] args) {
        // toString() = special method that all objects inherit,
        // that returns a string that "textually represents" an object.
        // can be used both implicitly and explicitly

        Car car = new Car();
        // explicitly
        System.out.println(car.toString());

        // implicitly
        System.out.println(car);
    }
}

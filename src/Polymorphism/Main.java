package Polymorphism;

public class Main {
    public static void main(String[] args) {
        // polymorphism = greek word for poly-"many", morph-"form".
        //                The ability of an object to identify as more than one type.

        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();

        Vehicle[] racers = {car,bicycle,boat};

        // all classes have go method that overrides go method in vehicle

        for(Vehicle x : racers){
            x.go();
        }
    }
}

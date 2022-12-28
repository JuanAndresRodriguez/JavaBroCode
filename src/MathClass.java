public class MathClass {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;

        double zMax = Math.max(x,y);
        double zMin = Math.min(x,y);

        System.out.println(zMax);
        System.out.println(zMin);

        // absolute method for obtaining the absoulte value.
        double zAbs = Math.abs(y);
        System.out.println(zAbs);

        double zSqrt = Math.sqrt(x);
        System.out.println(zSqrt);

        // round
        System.out.println(Math.round(zSqrt));
        // round up
        System.out.println(Math.ceil(zSqrt));
        // round down
        System.out.println(Math.floor(zSqrt));
    }
}

import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        // random dice
        int x = random.nextInt(6)+1;

        double y = random.nextDouble();

        boolean z = random.nextBoolean();


        System.out.println("dice: " + x);
        System.out.println("random number between 0 and 1: " + y);
        System.out.println("random boolan: " + z);
    }
}

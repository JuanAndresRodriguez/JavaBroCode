public class ForLoopStatement {
    public static void main(String[] args) {
        // for loop = executes a block of code a limited amount of times

        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }

        // loop backwards
        for(int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
        System.out.println("Happy new year!");

        // decrement by 2
        for(int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }
    }
}

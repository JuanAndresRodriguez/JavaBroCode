public class Methods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon
        hello();
        hello();
        hello();
        String name = "Bro";
        int age = 21;
        helloWithParam(name, age);

        int x = 3;
        int y = 4;
        int z = add(x,y);
        System.out.println(z);
    }

    static void hello() {
        System.out.println("hello");
    }
    static void helloWithParam(String title, int age){
        System.out.println("Hello " + title);
        System.out.println("You are " + age);
    }

    static int add(int a, int b) {
        return a + b;
    }
}

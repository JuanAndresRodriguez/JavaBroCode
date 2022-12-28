package accessModifiers.package1;
import accessModifiers.package2.*;

public class A {

    protected String protectedMessage = "This is protected";
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);

        B b = new B();
        // System.out.println(b.privateMessage); we can't access the private message

    }
}

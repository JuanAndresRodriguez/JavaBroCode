public class WrapperClasses {
    public static void main(String[] args) {
        // wrapper class = provides a way to use a primitive data type as reference data type
        // reference data type contains useful methods
        // can be used with collections (ex.ArrayList)

        // primitive  wrapper
        // ---------  -------
        // boolean    Boolean
        // char       Character
        // int        Integer
        // double     Double

        // autoboxing = the automatic conversion that the Java compiler makes between the primitive
        // and their corresponding object wrapper class.
        // unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to primitive

        // autoboxing
        Boolean a = true;
        Character b = '@';
        Integer c = 123;
        Double d = 3.14;
        String e = "Bro";

        // unboxing
        if (b == '@') {
            System.out.println("this is true");
        }

    }
}

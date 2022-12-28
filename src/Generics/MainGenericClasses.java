package Generics;

public class MainGenericClasses {
    public static void main(String[] args) {
        // Using multiple classes and methods
        MyIntegerClass myInt = new MyIntegerClass(1);
        MyDoubleClass myDouble = new MyDoubleClass(3.14);
        MyCharacterClass myChar = new MyCharacterClass('@');
        MyStringClass myString = new MyStringClass("Hello");

        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        System.out.println(myChar.getValue());
        System.out.println(myString.getValue());

        // Using one Generic Class and method. We indicate the data type
        MyGenericClass <Integer, Integer> myGenericInt = new MyGenericClass<>(1,9);
        MyGenericClass <Double, Double> myGenericDouble = new MyGenericClass<>(3.14,1.01);
        MyGenericClass <Character, Character> myGenericChar = new MyGenericClass<>('@','$');
        MyGenericClass <String, Character> myGenericString = new MyGenericClass<>("Hello",'!');

        System.out.println(myGenericInt.getValue());
        System.out.println(myGenericDouble.getValue());
        System.out.println(myGenericChar.getValue());
        System.out.println(myGenericString.getValue());
        System.out.println(myGenericInt.getValue2());
        System.out.println(myGenericDouble.getValue2());
        System.out.println(myGenericChar.getValue2());
        System.out.println(myGenericString.getValue2());

        // bounded types = you can create the objects of a generic class to have data
        //                 of specific derived types ex.Number
    }
}

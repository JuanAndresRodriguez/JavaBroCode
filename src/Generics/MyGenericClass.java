package Generics;

public class MyGenericClass <Thing, Thing2>{
    // public class MyGenericClass <Thing extends Number, Thing2 extends Number>{
    // To limit thing 1 and 2 to be sub types of Number class
    Thing x;
    Thing2 y;

    MyGenericClass(Thing x, Thing2 y) {
        this.x = x;
        this.y = y;
    }

    public Thing getValue(){
        return x;
    }
    public Thing2 getValue2(){
        return y;
    }
}

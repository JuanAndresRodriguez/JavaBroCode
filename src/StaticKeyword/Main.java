package StaticKeyword;

public class Main {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        // The class "owns" the static member

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");

        // access the static variable owned by the Friend class
        System.out.println(Friend.numberOfFriends);

        // it's also possible to access the static variable using an object from the class,
        // but it's recommended to access with the class name
        System.out.println(friend2.numberOfFriends);

        Friend.displayFriends();
    }
}

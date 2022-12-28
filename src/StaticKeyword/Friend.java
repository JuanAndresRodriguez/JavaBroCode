package StaticKeyword;

public class Friend {
    String name;

    static int numberOfFriends;
    // If the static modifier is removed we cannot access the number of Friends, outside the class.

    Friend(String name){
        this.name=name;
        numberOfFriends++;
    }

    static void displayFriends() {
        System.out.println("You have " + numberOfFriends + " friends");
    }
}

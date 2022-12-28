package VariableScope;

import java.util.Random;

public class DiceRoller {
    DiceRoller() {
        Random random = new Random();
        int number = 0;
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }

    // another way to access random and number
    // declaring them outside the method
    /*
    Random random;
    int number;
    DiceRoller() {
        random = new Random();
        number = 0;
        roll(random, number);
    }

    void roll(Random random, int number) {
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
    */
}

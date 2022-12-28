public class PrintfMethod {
    public static void main(String[] args) {
        // printf = an optional method to control, format, and display text to the console window
        // two arguments = format string + (object/variable/value)
        // % [flags] [precision] [width] [conversion-character]

        System.out.printf("This is a format string %d",123);
        System.out.println();
        System.out.printf("%d This is a format string",123);
        System.out.println();

        // [conversion-character]
        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        System.out.printf("%b",myBoolean);
        System.out.println();
        System.out.printf("%c",myChar);
        System.out.println();
        System.out.printf("%s",myString);
        System.out.println();
        System.out.printf("%d",myInt);
        System.out.println();
        System.out.printf("%f",myDouble);
        System.out.println();

        // [width]
        // minimum number of characters to be written as output
        System.out.printf("Hello %10s", myString);
        System.out.println();
        // - to justify left
        System.out.printf("Hello %-10s", myString);
        System.out.println();

        // [precision]
        // sets number of digits of precision when outputting floating-point values
        // limit decimals to two digists
        System.out.printf("You have this much money %.2f ", myDouble);
        System.out.println();
        // one decimal
        System.out.printf("You have this much money %.1f ", myDouble);
        System.out.println();

        // [flags]
        // adds an effect to output based on the flag addded to format specifier
        // - : left-justify
        // + : output a plus ( + ) or minus ( - ) sign for a numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000
        System.out.printf("You have this much money %-20f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %20f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %+20f", myDouble);
        System.out.println();
        double myNegativeDouble = -1000;
        System.out.printf("You have this much money %+f", myNegativeDouble);
        System.out.println();
        System.out.printf("You have this much money %020f", myDouble);
        System.out.println();
        System.out.printf("You have this much money %,f", myDouble);
        System.out.println();
    }
}

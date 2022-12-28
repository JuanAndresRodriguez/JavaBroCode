public class StringMethods {
    public static void main(String[] args) {
        // String = a reference data type that can store one or more characters
        // reference data types have access to useful methods

        String name = "Bro";

        boolean result = name.equals("Bro");

        System.out.println(result);

        int resultLength = name.length();
        System.out.println(resultLength);

        char resultChar = name.charAt(0);
        System.out.println(resultChar);

        int resultIndex = name.indexOf("B");
        System.out.println(resultIndex);

        boolean resultEmpty = name.isEmpty();
        System.out.println(resultEmpty);

        String resultUpperCase = name.toUpperCase();
        System.out.println(resultUpperCase);

        String resultLowerCase = name.toLowerCase();
        System.out.println(resultLowerCase);

        String nameToTrim = "   Bro  ";
        String resultTrim = name.trim();
        System.out.println(resultTrim);

        String resultReplace = name.replace('o', 'a');
        System.out.println(resultReplace);
    }
}

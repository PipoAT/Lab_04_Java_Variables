// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // declaring variables as int
        int intOperandA = 5;
        int intOperandB = 4;
        // the below variables should not be initialized with a value as it is seen as redundant and throws
        // a warning, however lab instructions did not indicate such clarification.
        int intSum = 1;
        int intProduct = 2;
        int intDifference = 3;
        int intQuotient = 6;
        int intModulo = 7;

        // declaring variables as double
        double doubleOperandA = 3.50;
        double doubleOperandB = 6.50;
        // the below variables should not be initialized with a value as it is seen as redundant and throws
        // a warning, however lab instructions did not indicate such clarification.
        double doubleSum = 4.25;
        double doubleProduct = 5.75;
        double doubleDifference = -5.5;
        double doubleQuotient = 3.14;

        // Tasks performed using the int typed variables

        intSum = intOperandA + intOperandB; // Assignment that uses the arithmetic operator +
        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum); // Output Statement

        intProduct = intOperandA * intOperandB; // Assignment that uses the arithmetic operator *
        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct); // Output Statement

        intDifference = intOperandA - intOperandB; // Assignment that uses the arithmetic operator -
        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference); // Output Statement

        intQuotient = intOperandA / intOperandB; // Assignment that uses the arithmetic operator /
        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient); // Output Statement

        intModulo = intOperandA % intOperandB; // Assignment that uses the arithmetic operator %
        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo); // Output Statement

        // Tasks performed using the double typed variables

        doubleSum = doubleOperandA + doubleOperandB; // Assignment that uses the arithmetic operator +
        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum); // Output Statement

        doubleProduct = doubleOperandA * doubleOperandB; // Assignment that uses the arithmetic operator *
        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct); // Output Statement

        doubleDifference = doubleOperandA - doubleOperandB; // Assignment that uses the arithmetic operator -
        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference); // Output Statement

        doubleQuotient = doubleOperandA / doubleOperandB; // Assignment that uses the arithmetic operator /
        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient); // Output Statement

        int kidsInMyFamily = 2; // the number of kids in your family
        String isRaining = "Yes"; // the answer to is it raining?
        double priceOfGas = 3.55; // the price of a gallon of gas
        int myFavoriteNumber = 7; // your favorite number
        int myShoeSize = 15; // your shoe size
        int myBirthMonth = 5; // your birth month
        String myFullName = "Andrew Thomas Pipo"; // your full name


    }
}
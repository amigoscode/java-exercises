package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Type Casting
 *
 * Learn how to convert between different data types in Java.
 * Widening (implicit): smaller type -> larger type (e.g., int -> double)
 * Narrowing (explicit): larger type -> smaller type (e.g., double -> int)
 */
public class TypeCasting {

    public static void main(String[] args) {

        // TODO: 1 - Widen an int to a double (implicit casting)
        // Declare an int variable with any value, then assign it to a double variable.
        // Print both variables to see the result.
        System.out.println("Widen an int to a double (implicit casting)");
        int number = 50;
        double numberCastedDouble = number;
        System.out.println("number: " + number);
        System.out.println("numberDouble: " + numberCastedDouble);

        // TODO: 2 - Narrow a double to an int (explicit casting)
        // Declare a double variable (e.g., 9.78), then cast it to an int.
        // Print both variables to see what happens to the decimal part.
        System.out.println("---------------------------------------------");
        System.out.println("Narrow a double to an int (explicit casting)");
        double todoTwoDouble = 9.78;
        int todoTwoInt = (int) todoTwoDouble;
        System.out.println("todoTwoDouble: " + todoTwoDouble);
        System.out.println("todoTwoInt: " + todoTwoInt);

        // TODO: 3 - Cast an int to a char to get the character it represents
        // Hint: int value 65 corresponds to 'A' in ASCII
        // Print the resulting char.
        System.out.println("---------------------------------------------");
        System.out.println("Cast an int to a char to get the character it represents");
        int todoThreeInt = 65;
        char todoThreeChar = (char) todoThreeInt;
        System.out.println("todoThreeInt: " + todoThreeInt);
        System.out.println("todoThreeChar: " + todoThreeChar);


        // TODO: 4 - Cast a char to an int to get its ASCII value
        // Hint: char 'Z' has an ASCII value of 90
        // Print the resulting int.
        System.out.println("---------------------------------------------");
        System.out.println("Cast a char to an int to get its ASCII value");
        char todoFourChar = 'Z';
        int todoFourInt = todoFourChar;
        System.out.println("todoFourChar: " + todoFourChar);
        System.out.println("todoFourInt: " + todoFourInt);



        // TODO: 5 - Convert a String "42" to an int using Integer.parseInt()
        // Declare a String variable with the value "42", then parse it to an int.
        // Print the result.
        System.out.println("---------------------------------------------");
        System.out.println("Convert a String \"42\" to an int using Integer.parseInt()");
        String todoFiveString = "42";
        System.out.println(Integer.parseInt(todoFiveString));


        // TODO: 6 - Convert an int 42 to a String using String.valueOf()
        // Declare an int variable with the value 42, then convert it to a String.
        // Print the result.
        System.out.println("---------------------------------------------");
        System.out.println("Convert an int 42 to a String using String.valueOf()");
        int todoSixInt = 42;
        String todoSixIntString = String.valueOf(todoSixInt);
        System.out.println(todoSixIntString);

    }
}

package com.amigoscode._1_beginners._1_thebasics;

/**
 * Exercise: Variables and Data Types
 *
 * Learn how to declare and use variables of different types in Java.
 * Java is a statically-typed language, meaning every variable must have a declared type.
 */
public class Variables {

    public static void main(String[] args) {

        // TODO: 1 - Declare an int variable called age and assign it the value 25
        int age = 25;

        // TODO: 2 - Declare a double variable called price and assign it the value 9.99
        double price = 9.99;

        // TODO: 3 - Declare a boolean variable called isJavaFun and assign it the value true
        boolean isJavaFun = true;

        // TODO: 4 - Declare a String variable called name and assign it your name
        String name = "Amigos";

        // TODO: 5 - Declare a char variable called grade and assign it the value 'A'
        char grade = 'A';

        // TODO: 6 - Print all the variables above using System.out.println
        // Hint: You can print each variable on its own line, e.g.:
        //   System.out.println("Age: " + age);
        System.out.println("Age: " + age);
        System.out.println("Price: " + price);
        System.out.println("Is Java Fun: " + isJavaFun);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);

        // TODO: 7 - Declare a final (constant) variable called MAX_SCORE, set it to 100, and print it
        // Hint: Use the 'final' keyword before the type to make a constant
        final int MAX_SCORE = 100;
        System.out.println("Max Score: " + MAX_SCORE);

    }
}

package com.amigoscode._2_developers._12_classes;

import java.util.Arrays;

/**
 * Enum Exercises
 * <p>
 * Practice creating and using enums in Java. Enums are special classes that
 * represent a fixed set of constants. They can have fields, constructors,
 * and methods just like regular classes.
 */
public class EnumExercises {

    // TODO: 1 - Create an enum called Season with four constants:
    //  SPRING, SUMMER, AUTUMN, WINTER
    //  For now, just declare them without any fields or methods.


    // TODO: 2 - Modify the Season enum to add:
    //  - A private final String 'description' field
    //  - A constructor that takes a String description and assigns it
    //  - Update each constant to pass a description, e.g.:
    //    SPRING("Flowers bloom"), SUMMER("Sun shines"),
    //    AUTUMN("Leaves fall"), WINTER("Snow falls")
    //  Note: Enum constructors are always private (even without the keyword).


    // TODO: 3 - Add a method getDescription() to the Season enum that
    //  returns the description field.


    // TODO: 4 - Create an enum called Priority with three constants:
    //  LOW(1), MEDIUM(2), HIGH(3)
    //  Each constant has a numeric level.
    //  Add:
    //  - A private final int 'level' field
    //  - A constructor that takes an int level
    //  - A getter getLevel()


    public static void main(String[] args) {
        System.out.println("=== Season Switch ===");
        // TODO: 5 - Use a switch statement (or switch expression) with a Season value.
        //  For each season, print a message like "Spring: Flowers bloom"
        //  using the getDescription() method.
        //  Test with Season.SUMMER.
        Season season = Season.WINTER;

        switch (season) {
            case WINTER:
            case FALL:
            case SUMMER:
            case SPRING:
                System.out.println(season.getDescription());
                break;
            default:
                System.out.println("Invalid Season");
                break;
        }


        System.out.println("\n=== Iterate Over Enum Values ===");
        // TODO: 6 - Use Season.values() to get an array of all Season constants.
        //  Loop through them and print each one with its description and ordinal.
        //  Example output: "0: SPRING - Flowers bloom"
        //  Also iterate over Priority.values() and print each with its level.
        Season[] seasons = Season.values();
        for(int i = 0; i < seasons.length; i++) {
            System.out.println(i + ": " + seasons[i] + " - " + seasons[i].getDescription());
        }

        System.out.println("============");

        Priority[] priorities = Priority.values();
        for(int i = 0; i < priorities.length; i++) {
            System.out.println(i + ": " + priorities[i] + " - " + priorities[i].getLevel());
        }

    }
}

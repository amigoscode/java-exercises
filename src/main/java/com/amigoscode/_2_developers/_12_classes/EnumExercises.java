package com.amigoscode._2_developers._12_classes;

/**
 * Enum Exercises
 *
 * Practice creating and using enums in Java. Enums are special classes that
 * represent a fixed set of constants. They can have fields, constructors,
 * and methods just like regular classes.
 */
public class EnumExercises {

    // TODO: 1, 2, 3 - Create an enum called Season with descriptions.
    enum Season {
        SPRING("Flowers bloom"),
        SUMMER("Sun shines"),
        AUTUMN("Leaves fall"),
        WINTER("Snow falls");

        private final String description;

        Season(String description) {
            this.description = description;
        }

        public String getDescription() {
            return description;
        }
    }

    // TODO: 4 - Create an enum called Priority with numeric levels.
    enum Priority {
        LOW(1), MEDIUM(2), HIGH(3);

        private final int level;

        Priority(int level) {
            this.level = level;
        }

        public int getLevel() {
            return level;
        }
    }


    public static void main(String[] args) {
        System.out.println("=== Season Switch ===");
        // TODO: 5 - Use a switch statement (or switch expression) with a Season value.
        //  For each season, print a message like "Spring: Flowers bloom"
        //  using the getDescription() method.
        //  Test with Season.SUMMER.
        Season season = Season.SUMMER;
        switch (season) {
            case SPRING -> System.out.println("Spring: " + Season.SPRING.getDescription());
            case SUMMER -> System.out.println("Summer: " + Season.SUMMER.getDescription());
            case AUTUMN -> System.out.println("Autumn: " + Season.AUTUMN.getDescription());
            case WINTER -> System.out.println("Winter: " + Season.WINTER.getDescription());
        }

        System.out.println("\n=== Iterate Over Enum Values ===");
        // TODO: 6 - Use Season.values() to get an array of all Season constants.
        //  Loop through them and print each one with its description and ordinal.
        //  Example output: "0: SPRING - Flowers bloom"
        //  Also iterate over Priority.values() and print each with its level.
        for (Season s : Season.values()) {
            System.out.println(s.ordinal() + ": " + s + " - " + s.getDescription());
        }
        for (Priority p : Priority.values()) {
            System.out.println(p + " (level " + p.getLevel() + ")");
        }
    }
}

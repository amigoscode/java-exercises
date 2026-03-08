package com.amigoscode._2_developers._13_staticmembers;

/**
 * Static Members Exercises
 *
 * Practice using static fields, static methods, and understanding the difference
 * between static (class-level) and instance (object-level) members.
 * Static members belong to the class itself, not to any specific instance.
 */
public class StaticExercises {

    // TODO: 1 - Create a private static int field called 'counter' initialized to 0.
    //  This field is shared among ALL instances of StaticExercises.

    // An instance field for comparison (already provided)
    private String instanceName;

    // TODO: 2 - Create a constructor that takes a String name parameter.
    //  Assign the name to instanceName.
    //  Increment the static counter by 1 each time a new instance is created.


    // TODO: 3 - Create a public static method: int getCount()
    //  Returns the current value of counter.
    //  Note: static methods can only access static fields, not instance fields.


    // TODO: 4 - Create a public static utility method: double celsiusToFahrenheit(double celsius)
    //  Returns the temperature in Fahrenheit using the formula: (celsius * 9/5) + 32.
    //  Utility methods are a common use case for static methods — they don't need
    //  any instance state.


    // TODO: 5 - Create a public method (non-static): String getInfo()
    //  Returns "Instance: <instanceName>, Total instances: <counter>"
    //  This demonstrates that instance methods can access BOTH instance and static fields.
    //  A static method could NOT access instanceName.


    // TODO: 6 - Create a public static factory method: StaticExercises createDefault()
    //  Returns a new StaticExercises instance with the name "Default".
    //  Factory methods are static methods that create and return instances.
    //  They are an alternative to constructors and can have descriptive names.


    public static void main(String[] args) {
        // Uncomment the code below after completing all TODOs:

        // System.out.println("=== Static Counter ===");
        // System.out.println("Count before creating instances: " + getCount());

        // StaticExercises obj1 = new StaticExercises("First");
        // StaticExercises obj2 = new StaticExercises("Second");
        // StaticExercises obj3 = new StaticExercises("Third");

        // System.out.println("Count after creating 3 instances: " + getCount());

        // System.out.println("\n=== Static Utility Method ===");
        // System.out.println("0°C = " + celsiusToFahrenheit(0) + "°F");
        // System.out.println("100°C = " + celsiusToFahrenheit(100) + "°F");
        // System.out.println("37°C = " + celsiusToFahrenheit(37) + "°F");

        // System.out.println("\n=== Static vs Instance ===");
        // System.out.println(obj1.getInfo());
        // System.out.println(obj2.getInfo());
        // Note: getCount() is called on the class, getInfo() is called on an instance
        // StaticExercises.getCount() works, but StaticExercises.getInfo() does NOT compile

        // System.out.println("\n=== Static Factory Method ===");
        // StaticExercises defaultObj = StaticExercises.createDefault();
        // System.out.println(defaultObj.getInfo());
    }
}

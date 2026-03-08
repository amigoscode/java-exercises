package com.amigoscode._2_developers._4_accessmodifiers;

/**
 * Access Modifiers Demo
 *
 * Demonstrates how different access modifiers behave when accessing members
 * from another class in the SAME package. Complete the AccessModifiers class first.
 */
public class AccessDemo {

    public static void main(String[] args) {
        // TODO: 1 - Create an instance of AccessModifiers.

        System.out.println("=== Calling Public Method ===");
        // TODO: 2 - Call the publicGreeting() method on your instance and print the result.
        //  This works because public methods are accessible from anywhere.

        System.out.println("\n=== Calling Package-Private Method ===");
        // TODO: 3 - Call the packageGreeting() method on your instance and print the result.
        //  This works because AccessDemo is in the SAME package as AccessModifiers.

        System.out.println("\n=== Accessing Private Field Through Getter ===");
        // TODO: 4 - Use setSecret() to set a value, then use getSecret() to read it back.
        //  Print the result. This demonstrates proper encapsulation:
        //  we access the private field only through public getter/setter methods.

        System.out.println("\n=== Why Direct Private Access Won't Work ===");
        // TODO: 5 - Write a comment explaining why the following line would NOT compile:
        //  // instance.secret = "trying direct access";
        //  Then leave the line commented out, preceded by your explanation.
        //  Hint: think about what 'private' means for field visibility outside the class.

    }
}

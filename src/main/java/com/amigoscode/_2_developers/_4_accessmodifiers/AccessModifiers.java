package com.amigoscode._2_developers._4_accessmodifiers;

/**
 * Access Modifiers Exercises
 *
 * Practice declaring fields and methods with private, public, protected,
 * and package-private (default) access levels. Implement getters/setters
 * and demonstrate encapsulation.
 */
public class AccessModifiers {

    // TODO: 1 - Declare a private String field called 'secret'.
    //  Private means only this class can access it directly.


    // TODO: 2 - Declare a public method called 'publicGreeting' that returns
    //  the String "Hello from a public method!".
    //  Public means any class, in any package, can call this method.


    // TODO: 3 - Declare a protected method called 'protectedGreeting' that returns
    //  the String "Hello from a protected method!".
    //  Protected means accessible within this package and by subclasses in other packages.


    // TODO: 4 - Declare a package-private (default) method called 'packageGreeting'
    //  that returns the String "Hello from a package-private method!".
    //  Package-private means no access modifier keyword — accessible only within this package.


    // TODO: 5 - Create a getter (getSecret) and a setter (setSecret) for the 'secret' field.
    //  The getter should be public and return the secret.
    //  The setter should be public, take a String parameter, and assign it to the field.


    // TODO: 6 - Create a public method called 'demonstrateInternalAccess' that:
    //  - Sets the secret field directly (not through the setter) to "Internal access works!"
    //  - Calls all three greeting methods (public, protected, package-private)
    //  - Returns a String summarizing: the secret value and all three greetings,
    //    separated by newlines.
    //  This demonstrates that within the same class, ALL access levels are accessible.

}

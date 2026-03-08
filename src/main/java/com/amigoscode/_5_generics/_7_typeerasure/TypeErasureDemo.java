package com.amigoscode._5_generics._7_typeerasure;

import java.util.ArrayList;
import java.util.List;

/**
 * Exercise: Type Erasure
 *
 * Java generics use "type erasure" -- the compiler enforces type safety at
 * compile time, then removes (erases) all generic type information at runtime.
 * This means List<String> and List<Integer> are both just List at runtime.
 *
 * This exercise explores the consequences and limitations of type erasure.
 *
 * Complete the TODOs below.
 */
public class TypeErasureDemo {

    public static void main(String[] args) {

        // TODO: 1 - Create a List<String> and a List<Integer>.
        //  Add some elements to each. Then compare their getClass() values
        //  using == and print the result.
        //  Example: System.out.println(stringList.getClass() == intList.getClass());
        //  Are they the same class at runtime? Add a comment explaining why.
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        System.out.println("Same class? " + (stringList.getClass() == intList.getClass()));
        // Yes, they are the same class at runtime because type erasure removes the generic
        // type parameters. Both are just ArrayList at runtime.

        // TODO: 2 - Demonstrate that generic type info is lost at runtime.
        //  Print the getClass().getName() of both lists from TODO 1.
        //  Add a comment explaining what you see -- do the class names
        //  include <String> or <Integer>? Why not?
        System.out.println("stringList class: " + stringList.getClass().getName());
        System.out.println("intList class: " + intList.getClass().getName());
        // Both print "java.util.ArrayList" without any generic type info (<String> or <Integer>).
        // This is because type erasure removes all generic type information at compile time.

        // TODO: 3 - Show that instanceof works with raw types but NOT with
        //  parameterized types. Uncomment the code below, observe the error,
        //  then comment it back out. Write the correct version using the raw type.
        //
        // if (stringList instanceof ArrayList<String>) { }  // Does not compile
        //
        //  Write the working version:
        //  if (stringList instanceof ArrayList) { ... }
        //  Add a comment explaining why you cannot use instanceof with generics.
        if (stringList instanceof ArrayList) {
            System.out.println("stringList is an ArrayList (raw type check works)");
        }
        // You cannot use instanceof with parameterized types because generic type info
        // is erased at runtime. The JVM has no way to check if it's ArrayList<String>
        // vs ArrayList<Integer> -- they're all just ArrayList.

        // TODO: 4 - Show that you cannot create a generic array.
        //  Uncomment the line below and observe the compile error.
        //  Comment it back out and add an explanation.
        //
        // public static <T> T[] createArray(int size) {
        //     return new T[size];  // Why doesn't this compile?
        // }
        //
        // Since T is erased at runtime, the JVM would not know what type of array to create.
        // Arrays need to know their component type at runtime for type safety.
        // Workaround: use Array.newInstance(Class<T> clazz, int size) or create an Object[]
        // and cast it, or use a collection like ArrayList<T> instead.

        // TODO: 5 - Add a comment below summarizing:
        //  (a) What is type erasure?
        //  (b) When does it happen (compile-time or runtime)?
        //  (c) What are the main limitations it causes?
        //      (List at least 3: instanceof, array creation, and one more)
        //  (d) Why did Java choose type erasure? (Hint: backward compatibility)
        // (a) Type erasure is the process by which the Java compiler removes all generic type
        //     information and replaces type parameters with their bounds (or Object if unbounded).
        // (b) It happens at compile-time. The compiled bytecode contains no generic type info.
        // (c) Limitations: (1) Cannot use instanceof with parameterized types,
        //     (2) Cannot create generic arrays (new T[]), (3) Cannot create instances of type
        //     parameters (new T()), (4) Cannot use primitives as type parameters (List<int>).
        // (d) Java chose type erasure for backward compatibility -- it allows generic code
        //     to interoperate with pre-generics (Java 1.4 and earlier) code without changes.

    }
}

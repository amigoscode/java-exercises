package com.amigoscode._2_developers._12_classes;

import java.util.Objects;

/**
 * Classes and Objects Exercises
 *
 * Practice creating classes with fields, constructors, and methods.
 * Learn about constructor chaining, toString(), and equals().
 */
public class ClassesAndObjects {

    // TODO: 1 - Create a static inner class called Person with:
    //  - A private String field 'name'
    //  - A private int field 'age'

    // TODO: 2 - Add a constructor to Person that takes String name and int age,
    //  and assigns them to the fields.

    // TODO: 3 - Add a no-args constructor to Person that sets name to "Unknown"
    //  and age to 0. Use constructor chaining — call the other constructor
    //  using this("Unknown", 0) instead of setting fields directly.

    // TODO: 4 - Add a toString() method to Person that returns:
    //  "Person{name='<name>', age=<age>}"

    // TODO: 5 - Add an equals() method and hashCode() to Person.
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public Person() {
            this("Unknown", 0);
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return age == person.age && Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, age);
        }
    }


    public static void main(String[] args) {
        // TODO: 6 - Create at least three Person objects:
        //  - One using the two-arg constructor (e.g., "Alice", 30)
        //  - One using the no-args constructor
        //  - One with the same name and age as the first
        //  Print all three using System.out.println() (which calls toString()).
        //  Test equals(): compare person1 with person3 (should be true),
        //  and person1 with person2 (should be false).
        //  Print the comparison results.
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person();
        Person person3 = new Person("Alice", 30);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println("person1.equals(person3): " + person1.equals(person3));
        System.out.println("person1.equals(person2): " + person1.equals(person2));

        // TODO: 7 - Demonstrate constructor chaining with this():
        //  Constructor chaining is when a constructor calls another constructor in the same
        //  class using this(...), avoiding duplicating initialization logic.
        //  The no-args constructor created in TODO 3 already demonstrates this.
        System.out.println("No-args person: " + person2);
    }
}

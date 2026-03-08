package com.amigoscode._8_testing._5_assertj;

import java.util.Objects;

/**
 * A Person class representing a person with name, age, and email.
 * This class is fully implemented - focus on writing tests in PersonTest.java using AssertJ.
 */
public class Person {

    private final String name;
    private final int age;
    private final String email;

    public Person(String name, int age, String email) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Invalid email address");
        }
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name) &&
                Objects.equals(email, person.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, email);
    }

    @Override
    public String toString() {
        return "Person{name='%s', age=%d, email='%s'}".formatted(name, age, email);
    }
}

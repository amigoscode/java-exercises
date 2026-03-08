package com.amigoscode._8_testing._5_assertj;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

/**
 * Exercise: AssertJ Fluent Assertions
 *
 * Practice using AssertJ's fluent assertion API for more readable tests.
 * AssertJ provides richer assertions than JUnit 5's built-in assertions.
 */
@DisplayName("AssertJ Person Tests")
class PersonTest {

    private Person alice;
    private Person bob;
    private Person charlie;
    private List<Person> people;

    @BeforeEach
    void setUp() {
        alice = new Person("Alice", 30, "alice@example.com");
        bob = new Person("Bob", 25, "bob@example.com");
        charlie = new Person("Charlie", 35, "charlie@work.com");
        people = List.of(alice, bob, charlie);
    }

    // TODO: 1 - Use assertThat(name).isEqualTo() to test a Person's name.
    //  Use assertThat(alice.getName()).isEqualTo("Alice").
    //  Also assert bob's name is "Bob".


    // TODO: 2 - Use assertThat(age).isGreaterThan() to test age comparisons.
    //  Assert that charlie's age is greater than bob's age.
    //  Assert that bob's age is between 20 and 30 (use isBetween).
    //  Assert that alice's age is greaterThanOrEqualTo(30).


    // TODO: 3 - Use assertThat(email).contains("@") to test email format.
    //  Assert that alice's email contains "@".
    //  Assert that alice's email endsWith("example.com").
    //  Assert that alice's email startsWith("alice").


    // TODO: 4 - Use assertThat(list).hasSize().contains() to test the people list.
    //  Assert that the people list hasSize(3).
    //  Assert that the people list contains(alice, bob).
    //  Assert that the people list doesNotContain(new Person("Dave", 40, "dave@example.com")).


    // TODO: 5 - Use assertThat(list).filteredOn().hasSize() to filter and test.
    //  Filter the people list where age > 28 and assert the filtered list has size 2.
    //  Hint: assertThat(people).filteredOn(p -> p.getAge() > 28).hasSize(2);
    //  Also filter where email contains "example.com" and assert size is 2.


    // TODO: 6 - Use assertThat(list).extracting("name").contains() to extract fields.
    //  Extract names from the people list and assert it contains "Alice", "Bob", "Charlie".
    //  Hint: assertThat(people).extracting(Person::getName).contains("Alice", "Bob", "Charlie");
    //  Also extract ages and verify they contain 30, 25, 35.


    // TODO: 7 - Use assertThat(string).startsWith().endsWith() for string assertions.
    //  Assert that "Hello World" starts with "Hello" and ends with "World".
    //  Assert that "Hello World" containsIgnoringCase("hello").
    //  Assert that "Hello World" hasSize(11).
    //  Hint: Chain assertions like assertThat("Hello World").startsWith("Hello").endsWith("World");


    // TODO: 8 - Test exception with assertThatThrownBy.
    //  Use assertThatThrownBy(() -> new Person(null, 25, "test@test.com"))
    //      .isInstanceOf(IllegalArgumentException.class)
    //      .hasMessageContaining("null");
    //  Also test that negative age throws IllegalArgumentException.
    //  Also test that invalid email throws IllegalArgumentException.

}

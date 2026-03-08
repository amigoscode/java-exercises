package com.amigoscode._8_testing._9_mocking;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * Exercise: Mocking Time with a Clock Interface
 *
 * Practice mocking the Clock interface to control time in tests.
 * This pattern is essential for testing time-dependent logic reliably.
 *
 * TimedGreeter rules:
 *   5:00 - 11:59  -> "Good morning"
 *   12:00 - 16:59 -> "Good afternoon"
 *   17:00 - 4:59  -> "Good evening"
 */
@DisplayName("Clock Mocking Tests")
@ExtendWith(MockitoExtension.class)
class ClockMockingTest {

    @Mock
    private Clock clock;

    // TODO: 1 - Create a TimedGreeter with the mocked Clock.
    //  In each test below, you will need to create:
    //  TimedGreeter greeter = new TimedGreeter(clock);
    //  Or you can declare it as a field and set it up in a @BeforeEach method.

    // TODO: 2 - Stub clock.now() to return a morning time and test greet().
    //  when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 8, 0));
    //  TimedGreeter greeter = new TimedGreeter(clock);
    //  assertEquals("Good morning", greeter.greet());
    @Test
    @DisplayName("Morning greeting at 8:00")
    void testMorningGreeting() {
        when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 8, 0));
        TimedGreeter greeter = new TimedGreeter(clock);
        assertEquals("Good morning", greeter.greet());
    }

    // TODO: 3 - Test greet() returns "Good morning" for boundary times.
    //  Test with hour = 5 (start of morning): should return "Good morning".
    //  Test with hour = 11 (end of morning): should return "Good morning".
    @Test
    @DisplayName("Morning boundaries")
    void testMorningBoundaries() {
        when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 5, 0));
        TimedGreeter greeter = new TimedGreeter(clock);
        assertEquals("Good morning", greeter.greet());

        when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 11, 0));
        assertEquals("Good morning", greeter.greet());
    }

    // TODO: 4 - Stub clock.now() to return an afternoon time and test.
    //  when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 14, 0));
    //  Assert greeter.greet() returns "Good afternoon".
    //  Also test boundary: hour = 12 and hour = 16.
    @Test
    @DisplayName("Afternoon greeting and boundaries")
    void testAfternoonGreeting() {
        when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 14, 0));
        TimedGreeter greeter = new TimedGreeter(clock);
        assertEquals("Good afternoon", greeter.greet());

        when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 12, 0));
        assertEquals("Good afternoon", greeter.greet());

        when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 16, 0));
        assertEquals("Good afternoon", greeter.greet());
    }

    // TODO: 5 - Stub clock.now() to return an evening time and test.
    //  when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 20, 0));
    //  Assert greeter.greet() returns "Good evening".
    //  Also test boundaries: hour = 17 (start of evening) and hour = 4 (late night).
    @Test
    @DisplayName("Evening greeting and boundaries")
    void testEveningGreeting() {
        when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 20, 0));
        TimedGreeter greeter = new TimedGreeter(clock);
        assertEquals("Good evening", greeter.greet());

        when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 17, 0));
        assertEquals("Good evening", greeter.greet());

        when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 4, 0));
        assertEquals("Good evening", greeter.greet());
    }

    // TODO: 6 - Verify that clock.now() was called during greet().
    //  Stub clock.now() to return any time.
    //  Call greeter.greet().
    //  verify(clock).now();
    //  verify(clock, times(1)).now();
    //  This confirms the greeter is actually using the clock.
    @Test
    @DisplayName("Verify clock.now() is called")
    void testClockIsCalled() {
        when(clock.now()).thenReturn(LocalDateTime.of(2024, 1, 1, 10, 0));
        TimedGreeter greeter = new TimedGreeter(clock);
        greeter.greet();
        verify(clock).now();
        verify(clock, times(1)).now();
    }

}

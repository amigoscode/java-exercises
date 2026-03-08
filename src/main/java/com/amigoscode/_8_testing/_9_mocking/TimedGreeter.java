package com.amigoscode._8_testing._9_mocking;

import java.time.LocalDateTime;

/**
 * A greeter that returns different greetings based on the time of day.
 * Uses the Clock interface so time can be mocked in tests.
 *
 * Greeting rules:
 *   5:00 - 11:59  -> "Good morning"
 *   12:00 - 16:59 -> "Good afternoon"
 *   17:00 - 4:59  -> "Good evening"
 */
public class TimedGreeter {

    private final Clock clock;

    public TimedGreeter(Clock clock) {
        this.clock = clock;
    }

    /**
     * Returns a greeting based on the current time.
     */
    public String greet() {
        LocalDateTime now = clock.now();
        int hour = now.getHour();

        if (hour >= 5 && hour < 12) {
            return "Good morning";
        } else if (hour >= 12 && hour < 17) {
            return "Good afternoon";
        } else {
            return "Good evening";
        }
    }
}

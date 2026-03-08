package com.amigoscode._6_functionalinterfaces._4_callbacks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/**
 * Exercise: Event Processor with Functional Interfaces
 *
 * Build a simple event system where listeners (Consumer<String>) can be
 * registered for named events. When an event is emitted, all registered
 * listeners for that event are called with the event data.
 *
 * This pattern is widely used in UI frameworks, message brokers, and
 * reactive programming.
 */
public class EventProcessor {

    // TODO: 1 - Create a field called 'listeners' of type
    //  Map<String, List<Consumer<String>>>. Initialize it as a new HashMap.
    //  The key is the event name (e.g., "onClick"), and the value is a list
    //  of listener callbacks registered for that event.
    private final Map<String, List<Consumer<String>>> listeners = new HashMap<>();

    // TODO: 2 - Create a method addListener(String event, Consumer<String> listener)
    //  that adds a listener for the given event. If no listeners exist for the
    //  event yet, create a new ArrayList first, then add the listener.
    //  Hint: Use listeners.computeIfAbsent(event, k -> new ArrayList<>())
    void addListener(String event, Consumer<String> listener) {
        listeners.computeIfAbsent(event, k -> new ArrayList<>()).add(listener);
    }

    // TODO: 3 - Create a method emit(String event, String data) that looks up
    //  all listeners for the given event and calls each one with the data.
    //  If no listeners are registered for the event, print
    //  "No listeners for event: <event>"
    void emit(String event, String data) {
        List<Consumer<String>> eventListeners = listeners.get(event);
        if (eventListeners == null || eventListeners.isEmpty()) {
            System.out.println("No listeners for event: " + event);
        } else {
            eventListeners.forEach(listener -> listener.accept(data));
        }
    }

    public static void main(String[] args) {

        EventProcessor processor = new EventProcessor();

        // TODO: 4 - Register multiple listeners for the "onClick" event:
        //  a) A listener that prints "Button clicked! Data: <data>"
        //  b) A listener that prints "Logging click event: <data>"
        //  c) A listener that prints "Analytics: tracking click - <data>"
        processor.addListener("onClick", data -> System.out.println("Button clicked! Data: " + data));
        processor.addListener("onClick", data -> System.out.println("Logging click event: " + data));
        processor.addListener("onClick", data -> System.out.println("Analytics: tracking click - " + data));

        // TODO: 5 - Register a listener for the "onHover" event that prints
        //  "Hovering over: <data>"
        processor.addListener("onHover", data -> System.out.println("Hovering over: " + data));

        // TODO: 6 - Emit the following events and observe all listeners being called:
        //  a) Emit "onClick" with data "submit-button"
        //  b) Emit "onClick" with data "cancel-button"
        //  c) Emit "onHover" with data "menu-item"
        //  d) Emit "onScroll" with data "page-down" (no listeners registered)
        processor.emit("onClick", "submit-button");
        processor.emit("onClick", "cancel-button");
        processor.emit("onHover", "menu-item");
        processor.emit("onScroll", "page-down");

    }
}

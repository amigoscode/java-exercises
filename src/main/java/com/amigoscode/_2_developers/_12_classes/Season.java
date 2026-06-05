package com.amigoscode._2_developers._12_classes;

public enum Season {
    WINTER("Snow falls"),
    SUMMER("Sun shines"),
    SPRING("Flowers bloom"),
    FALL("Leaves fall");

    private final String description;

    private Season(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}

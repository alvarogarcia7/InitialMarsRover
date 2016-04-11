package com.dodevjutsu.kata.marsrover;

public class Command {
    private final String value;

    public Command(String value) {
        this.value = value;
    }

    public static Command left() {
        return new Command("l");
    }

    public String value() {
        return value;
    }
}

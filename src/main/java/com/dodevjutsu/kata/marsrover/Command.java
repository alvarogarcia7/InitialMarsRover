package com.dodevjutsu.kata.marsrover;

public class Command {
    public Command(String value) {

    }

    public static Command left() {
        return new Command("l");
    }
}

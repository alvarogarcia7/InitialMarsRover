package com.dodevjutsu.kata.marsrover;

import java.util.Arrays;
import java.util.List;

public class Commands {
    private final Command[] commands;

    public Commands(Command... commands) {
        this.commands = commands;
    }

    public List<Command> values() {
        return Arrays.asList(commands);
    }
}

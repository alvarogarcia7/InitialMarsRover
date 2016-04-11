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

    public static Command from(String value) {
        if (value.equals("l")) {
            return Command.left();
        } else if (value.equals("r")) {
            return Command.right();
        } else if (value.equals("f")) {
            return Command.forward();
        } else if (value.equals("b")) {
            return Command.backward();
        }

        return new Command(value);
    }

    public static Command backward() {
        return new Command("b");
    }

    public static Command forward() {
        return new Command("f");
    }

    public static Command right() {
        return new Command("r");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Command command = (Command) o;

        return value != null ? value.equals(command.value) : command.value == null;

    }

    @Override
    public int hashCode() {
        return value != null ? value.hashCode() : 0;
    }
}

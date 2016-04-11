package com.dodevjutsu.kata.marsrover;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommandParser {
    public Commands split(String commandsRepresentation) {
        Command[] commands = splitCommands(commandsRepresentation);
        return new Commands(commands);
    }

    private Command[] splitCommands(String commandsRepresentation) {
        List<Command> commandList = Arrays.asList(commandsRepresentation.split("")).stream().map(Command::new).collect(Collectors.toList());
        return commandList.toArray(new Command[commandList.size()]);
    }
}

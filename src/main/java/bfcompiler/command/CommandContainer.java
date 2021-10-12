package bfcompiler.command;

import bfcompiler.IndexHolder;
import bfcompiler.Memory;
import bfcompiler.command.impl.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static bfcompiler.command.CommandName.*;

/**
 * Container of the {@link Command}s, which are using for handling brainfuck commands.
 */
public class CommandContainer {
    private final Map<Character, Command> commandMap;
    private final Command unknownCommand;

    public CommandContainer(Memory memory, StringBuilder result, IndexHolder indexHolder) {
        Stack<Integer> stackDefiningLoopPositions = new Stack<>();
        commandMap = new HashMap<>();
        commandMap.put(INCPOINTER.getCommandName(), new IncPointerCommand(memory));
        commandMap.put(DECPOINTER.getCommandName(), new DecPointerCommand(memory));
        commandMap.put(INCDATA.getCommandName(), new IncDataCommand(memory));
        commandMap.put(DECDATA.getCommandName(), new DecDataCommand(memory));
        commandMap.put(OUTPUT.getCommandName(), new OutputCommand(memory, result));
        commandMap.put(WHILE.getCommandName(), new WhileCommand(stackDefiningLoopPositions, indexHolder));
        commandMap.put(END.getCommandName(), new EndCommand(memory, stackDefiningLoopPositions, indexHolder));

        unknownCommand = new UnknownCommand();
    }

    public Command retrieveCommand(char commandIdentifier) {
        return commandMap.getOrDefault(commandIdentifier, unknownCommand);
    }
}

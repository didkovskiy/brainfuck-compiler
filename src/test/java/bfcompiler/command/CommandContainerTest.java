package bfcompiler.command;

import bfcompiler.IndexHolder;
import bfcompiler.Memory;
import bfcompiler.command.impl.UnknownCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommandContainerTest {
    private CommandContainer commandContainer;

    @BeforeEach
    public void init() {
        Memory memory = new Memory(new byte[2048], 0);
        StringBuilder result = new StringBuilder();
        IndexHolder indexHolder = new IndexHolder();

        commandContainer = new CommandContainer(memory, result, indexHolder);
    }

    @Test
    public void shouldReturnUnknownCommand() {
        char unknownCommand = '&';

        Command command = commandContainer.retrieveCommand(unknownCommand);

        assertEquals(UnknownCommand.class, command.getClass());
    }
}
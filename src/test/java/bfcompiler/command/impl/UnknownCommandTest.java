package bfcompiler.command.impl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UnknownCommandTest {
    private final UnknownCommand unknownCommand = new UnknownCommand();

    @Test
    public void shouldThrowUnsupportedOperationExceptionForUnknownCommands(){
        assertThrows(UnsupportedOperationException.class, unknownCommand::execute);
    }
}
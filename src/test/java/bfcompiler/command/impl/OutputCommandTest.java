package bfcompiler.command.impl;

import bfcompiler.Memory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OutputCommandTest {

    private final Memory memory = new Memory(new byte[2048], 0);
    private final StringBuilder result = new StringBuilder();
    private final OutputCommand outputCommand = new OutputCommand(memory, result);

    @Test
    public void shouldSaveOutput() {
        memory.getMemoryDataArray()[0] = 87;

        outputCommand.execute();

        assertEquals("W", result.toString());
    }

}
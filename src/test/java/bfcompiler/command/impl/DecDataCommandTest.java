package bfcompiler.command.impl;

import bfcompiler.Memory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecDataCommandTest {

    private DecDataCommand decDataCommand;
    private Memory memory;

    @BeforeEach
    public void init() {
        memory = new Memory(new byte[2048], 0);
        decDataCommand = new DecDataCommand(memory);
    }

    @Test
    public void shouldDecrementMemoryData() {
        memory.getMemoryDataArray()[0]++;

        decDataCommand.execute();

        assertEquals(0, memory.getMemoryDataArray()[0]);
    }
}
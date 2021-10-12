package bfcompiler.command.impl;

import bfcompiler.Memory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncDataCommandTest {

    private final Memory memory = new Memory(new byte[2048], 0);
    private final IncDataCommand incDataCommand = new IncDataCommand(memory);

    @Test
    public void shouldIncrementMemoryData(){
        memory.getMemoryDataArray()[0] = 4;

        incDataCommand.execute();

        assertEquals(5, memory.getDataAtPointer());
    }

}
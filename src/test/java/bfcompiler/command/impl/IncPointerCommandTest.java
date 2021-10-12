package bfcompiler.command.impl;

import bfcompiler.Memory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IncPointerCommandTest {

    private IncPointerCommand incPointerCommand;
    private Memory memory;

    @BeforeEach
    public void init(){
        memory = new Memory(new byte[2048], 0);
        incPointerCommand = new IncPointerCommand(memory);
    }

    @Test
    public void shouldIncrementPointer(){
        memory.setPointer(20);

        incPointerCommand.execute();

        assertEquals(21, memory.getPointer());
    }

    @Test
    public void shouldSetPointerAfterOverflow(){
        memory.setPointer(2047);

        incPointerCommand.execute();

        assertEquals(0, memory.getPointer());
    }

}
package bfcompiler.command.impl;

import bfcompiler.Memory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecPointerCommandTest {

    private DecPointerCommand decPointerCommand;
    private Memory memory;

    @BeforeEach
    public void init() {
        memory = new Memory(new byte[2048], 0);
        decPointerCommand = new DecPointerCommand(memory);
    }

    @Test
    public void shouldDecrementPointer() {
        memory.setPointer(10);

        decPointerCommand.execute();

        assertEquals(9, memory.getPointer());
    }

    @Test
    public void shouldSetPointerInMaxPosition() {
        memory.setPointer(0);

        decPointerCommand.execute();

        assertEquals(2047, memory.getPointer());
    }

}
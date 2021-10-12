package bfcompiler.command.impl;

import bfcompiler.IndexHolder;
import bfcompiler.Memory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class EndCommandTest {

    private EndCommand endCommand;
    private Memory memory;
    private Stack<Integer> stackDefiningLoopPositions;
    private IndexHolder indexHolder;

    @BeforeEach
    public void init() {
        memory = new Memory(new byte[2048], 0);
        stackDefiningLoopPositions = new Stack<>();
        indexHolder = new IndexHolder();

        endCommand = new EndCommand(memory, stackDefiningLoopPositions, indexHolder);
    }

    @Test
    public void shouldJumpToTheStartOfLoopIndex() {
        stackDefiningLoopPositions.push(1);
        memory.getMemoryDataArray()[0] = 3;

        endCommand.execute();

        assertEquals(1, indexHolder.getCurrentIndex());
    }

}
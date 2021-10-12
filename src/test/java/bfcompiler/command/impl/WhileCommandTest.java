package bfcompiler.command.impl;

import bfcompiler.IndexHolder;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class WhileCommandTest {

    private final Stack<Integer> stackDefiningLoopPositions = new Stack<>();
    private final IndexHolder indexHolder = new IndexHolder();
    private final WhileCommand whileCommand = new WhileCommand(stackDefiningLoopPositions, indexHolder);

    @Test
    public void shouldSaveCurrentLoopIndex(){
        indexHolder.setCurrentIndex(5);

        whileCommand.execute();

        assertEquals(5, stackDefiningLoopPositions.peek());
    }

}
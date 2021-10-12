package bfcompiler.command.impl;

import bfcompiler.IndexHolder;
import bfcompiler.Memory;
import bfcompiler.command.Command;

import java.util.Stack;

/**
 * The {@link Command} that ends a loop iteration and jumps it back to the command after the matching {@link WhileCommand} command.
 * (Uses a {@link Stack} for defining its index).
 */
public class EndCommand implements Command {
    private final Memory memory;
    private final Stack<Integer> stackDefiningLoopPositions;
    private final IndexHolder indexHolder;

    public EndCommand(Memory memory, Stack<Integer> stackDefiningLoopPositions, IndexHolder indexHolder) {
        this.memory = memory;
        this.stackDefiningLoopPositions = stackDefiningLoopPositions;
        this.indexHolder = indexHolder;
    }

    @Override
    public void execute() {
        if (memory.getDataAtPointer() == 0) {
            stackDefiningLoopPositions.pop();
        } else indexHolder.setCurrentIndex(stackDefiningLoopPositions.peek());
    }
}

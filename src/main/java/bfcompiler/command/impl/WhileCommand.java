package bfcompiler.command.impl;

import bfcompiler.IndexHolder;
import bfcompiler.command.Command;

import java.util.Stack;

/**
 * The {@link Command} that starts a loop iteration and saves its index in {@link Stack}
 */
public class WhileCommand implements Command {
    private final Stack<Integer> stackDefiningLoopPositions;
    private final IndexHolder indexHolder;

    public WhileCommand(Stack<Integer> stackDefiningLoopPositions, IndexHolder indexHolder) {
        this.stackDefiningLoopPositions = stackDefiningLoopPositions;
        this.indexHolder = indexHolder;
    }

    @Override
    public void execute() {
        stackDefiningLoopPositions.push(indexHolder.getCurrentIndex());
    }
}

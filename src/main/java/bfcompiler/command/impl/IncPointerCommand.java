package bfcompiler.command.impl;

import bfcompiler.Memory;
import bfcompiler.command.Command;

/**
 * The {@link Command} that increments the data pointer (to point to the next cell to the right).
 */
public class IncPointerCommand implements Command {

    private final Memory memory;

    public IncPointerCommand(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void execute() {
        if (memory.getPointer() == memory.getMemoryDataArray().length - 1)
            memory.setPointer(0);
        else
            memory.incrementPointer();
    }
}

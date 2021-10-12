package bfcompiler.command.impl;

import bfcompiler.Memory;
import bfcompiler.command.Command;

/**
 * The {@link Command} that decrements the data pointer (to point to the next cell to the left).
 */
public class DecPointerCommand implements Command {

    private final Memory memory;

    public DecPointerCommand(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void execute() {
        if (memory.getPointer() == 0)
            memory.setPointer(memory.getMemoryDataArray().length - 1);
        else
            memory.decrementPointer();
    }
}

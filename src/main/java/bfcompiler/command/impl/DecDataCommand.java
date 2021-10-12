package bfcompiler.command.impl;

import bfcompiler.Memory;
import bfcompiler.command.Command;

/**
 * The {@link Command} that decrements (decrease by one) the byte at the data pointer.
 */
public class DecDataCommand implements Command {
    private final Memory memory;

    public DecDataCommand(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void execute() {
        memory.decrementMemoryData();
    }
}

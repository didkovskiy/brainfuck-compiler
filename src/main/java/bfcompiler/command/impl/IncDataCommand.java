package bfcompiler.command.impl;

import bfcompiler.Memory;
import bfcompiler.command.Command;

/**
 * The {@link Command} that increments (increase by one) the byte at the data pointer.
 */
public class IncDataCommand implements Command {
    private final Memory memory;

    public IncDataCommand(Memory memory) {
        this.memory = memory;
    }

    @Override
    public void execute() {
        memory.incrementMemoryData();
    }
}

package bfcompiler.command.impl;

import bfcompiler.Memory;
import bfcompiler.command.Command;

/**
 * The {@link Command} that saves output of the byte at the data pointer.
 */
public class OutputCommand implements Command {
    private final Memory memory;
    private final StringBuilder result;

    public OutputCommand(Memory memory, StringBuilder result) {
        this.memory = memory;
        this.result = result;
    }

    @Override
    public void execute() {
        result.append((char) memory.getDataAtPointer());
    }
}

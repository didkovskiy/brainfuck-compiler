package bfcompiler.command.impl;

import bfcompiler.command.Command;

/**
 * The {@link Command} that is executed when an unknown character is received.
 */
public class UnknownCommand implements Command {
    @Override
    public void execute() {
        throw new UnsupportedOperationException();
    }
}

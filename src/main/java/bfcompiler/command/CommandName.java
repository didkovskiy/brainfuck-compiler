package bfcompiler.command;

/**
 * Enumeration for {@link Command}'s.
 */
public enum CommandName {
    INCPOINTER('>'),
    DECPOINTER('<'),
    INCDATA('+'),
    DECDATA('-'),
    OUTPUT('.'),
    WHILE('['),
    END(']');

    private final char commandName;

    CommandName(char commandName) {
        this.commandName = commandName;
    }

    public char getCommandName() {
        return commandName;
    }
}

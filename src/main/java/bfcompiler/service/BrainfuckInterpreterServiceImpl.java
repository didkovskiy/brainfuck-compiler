package bfcompiler.service;

import bfcompiler.IndexHolder;
import bfcompiler.Memory;
import bfcompiler.command.CommandContainer;

public class BrainfuckInterpreterServiceImpl implements BrainfuckInterpreterService {

    private final CommandContainer commandContainer;
    private final StringBuilder result = new StringBuilder();
    private final IndexHolder indexHolder = new IndexHolder();

    public BrainfuckInterpreterServiceImpl(Memory memory) {
        this.commandContainer = new CommandContainer(memory, result, indexHolder);
    }

    @Override
    public String interpret(String bfInstructions) {
        for (int i = 0; i < bfInstructions.length(); i++) {
            commandContainer.retrieveCommand(bfInstructions.charAt(i)).execute();
            i = indexHolder.getCurrentIndex();
            indexHolder.increment();
        }
        return result.toString();
    }
}
package bfcompiler.service;

/**
 * Service that implements logic of Brainfuck instructions interpretation.
 */
public interface BrainfuckInterpreterService {
    /**
     * Main method that interprets brainfuck instructions.
     *
     * @param bfInstructions contains brainfuck commands to be interpreted.
     * @return String containing the output of the executed program.
     */
    String interpret(String bfInstructions);
}

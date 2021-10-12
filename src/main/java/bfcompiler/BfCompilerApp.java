package bfcompiler;

import bfcompiler.service.BrainfuckInterpreterService;
import bfcompiler.service.BrainfuckInterpreterServiceImpl;

/**
 * Main app class.
 */
public class BfCompilerApp {
    public static void main(String[] args) {
        Memory memory = new Memory(new byte[65535], 0);
        BrainfuckInterpreterService brainfuckInterpreterService = new BrainfuckInterpreterServiceImpl(memory);
        System.out.println(brainfuckInterpreterService.interpret(
                "++++++++++[>+++++++>++++++++++>+++>+<<<<-]>++.>+.+++++++..+++.>++.<<+++++++++++++++.>.+++.------.--------.>+.>."));
    }
}

package bfcompiler.service;

import bfcompiler.Memory;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BrainfuckInterpreterServiceTest {

    private final Memory memory = new Memory(new byte[66666], 0);
    private BrainfuckInterpreterService brainfuckInterpreterService;

    @BeforeEach
    public void init() {
        brainfuckInterpreterService = new BrainfuckInterpreterServiceImpl(memory);
    }

    @Test
    public void shouldProperlyInterpretBrainfuckInstructions() {
        String bfInstructions = "-[--->+<]>-.[---->+++++<]>-.+.++++++++++.+[---->+<]>+++.-[--->++<]>-.++++++++++.+[---->+<]>+++.[-->+++++++<]>.++.-------------.[--->+<]>---..+++++.-[---->+<]>++.+[->+++<]>.++++++++++++..---.[-->+<]>--------.";

        String result = brainfuckInterpreterService.interpret(bfInstructions);

        Assertions.assertEquals("This is pretty cool.", result);
    }

}
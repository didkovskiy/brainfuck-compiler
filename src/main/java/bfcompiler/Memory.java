package bfcompiler;

/**
 * Class that contains memory data for brainfuck programs.
 */
public class Memory {
    private final byte[] memoryData;
    private int pointer;

    public Memory(byte[] memory, int pointer) {
        this.memoryData = memory;
        this.pointer = pointer;
    }

    public int getPointer() {
        return pointer;
    }

    public void setPointer(int pointer) {
        this.pointer = pointer;
    }

    public byte[] getMemoryDataArray() {
        return memoryData;
    }

    public void incrementPointer() {
        pointer++;
    }

    public void decrementPointer() {
        pointer--;
    }

    public void incrementMemoryData() {
        memoryData[pointer]++;
    }

    public void decrementMemoryData() {
        memoryData[pointer]--;
    }

    public int getDataAtPointer() {
        return memoryData[pointer];
    }
}

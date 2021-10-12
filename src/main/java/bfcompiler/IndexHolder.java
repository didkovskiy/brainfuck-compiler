package bfcompiler;

/**
 * The class used to store the index of String of the brainfuck instructions.
 */
public class IndexHolder {
    private int index = 0;

    public int getCurrentIndex() {
        return index;
    }

    public void setCurrentIndex(int index) {
        this.index = index;
    }

    public void increment(){
        index++;
    }
}

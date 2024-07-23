package computer;

import java.util.List;

public class Computer {
    private final List<Integer> numberList;

    public Computer(List<Integer> numberList) {
        this.numberList = numberList;
    }

    public List<Integer> getNumberList() {
        return numberList;
    }
}

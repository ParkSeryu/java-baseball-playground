package player;

import common.Validator;
import java.util.ArrayList;
import java.util.List;
import ui.InputView;

public class Player {
    private final List<Integer> numberList = new ArrayList<>();
    private final InputView inputView;
    private final Validator validator;

    public Player(InputView inputView, Validator validator) {
        this.inputView = inputView;
        this.validator = validator;
    }

    public void createPlayerList() {
        while (numberList.size() < 3) {
            inputView.printPromptMsg();
            int inputNumber = inputView.getScannerNumber();
            boolean isValid = validator.isValid(numberList, inputNumber);
            addNumberInList(isValid, inputNumber);
        }
    }

    public List<Integer> getNumberList() {
        return numberList;
    }

    private void addNumberInList(boolean isValid, int inputNumber) {
        if (isValid) {
            numberList.add(inputNumber);
        }
    }
}

package numberGenerator;

import common.Validator;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    private final List<Integer> list = new ArrayList<>();
    private final Validator validator;

    public NumberGenerator(Validator validator) {
        this.validator = validator;
    }

    public List<Integer> init() {
        while (list.size() < 3) {
            int num = createNumber();
            boolean flag = checkValid(num);
            addList(flag, num);
        }
        return list;
    }

    public int createNumber() {
        return (int) (Math.random() * 10);
    }

    private boolean checkValid(int number) {
        return validator.isDuplicatedNumberIsExist(list, number);
    }

    private void addList(boolean flag, int num) {
        if (!flag) {
            list.add(num);
        }
    }

}

package numberGenerator;

import common.Validator;
import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    private final List<Integer> list = new ArrayList<>();

    public List<Integer> init() {
        while (list.size() < 3) {
            checkValid(list, createNumber());
        }
        return list;
    }

    public void checkValid(List<Integer> list, int num) {
        if (Validator.isDuplicatedNumberisExist(list, num)) {
            return;
        }

        list.add(num);
    }

    public int createNumber() {
        return (int) (Math.random() * 10);
    }
}

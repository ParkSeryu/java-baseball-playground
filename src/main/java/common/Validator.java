package common;

import java.util.List;

public class Validator {

    public boolean isValid(List<Integer> list, int num) {
        return !isDuplicatedNumberIsExist(list, num);
    }

    private boolean isDuplicatedNumberIsExist(List<Integer> list, int num) {
        return list.contains(num);
    }


}

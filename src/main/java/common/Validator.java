package common;

import java.util.List;

public class Validator {

    public boolean isDuplicatedNumberIsExist(List<Integer> list, int num) {
        return list.contains(num);
    }


}

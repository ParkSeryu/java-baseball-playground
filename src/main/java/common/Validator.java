package common;

import java.util.List;

public class Validator {

    public static boolean isDuplicatedNumberisExist(List<Integer> list, int num) {
        return list.contains(num);
    }

}

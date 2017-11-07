package com.kchmielewski.sda.tasks2.task2;

import java.util.ArrayList;
import java.util.List;

public class Imperative implements Squares {
    @Override
    public List<Integer> squares(List<Integer> integers) {
        List<Integer> result = new ArrayList<>(integers.size());
        for (Integer number : integers) {
            result.add(number * number);
        }

        return result;
    }
}

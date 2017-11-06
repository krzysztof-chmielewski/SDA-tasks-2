package com.kchmielewski.sda.tasks2.task2;

import java.util.ArrayList;
import java.util.List;

public class Imperative implements Squares {
    @Override
    public List<Integer> squares(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>(numbers.size());
        for (Integer number : numbers) {
            result.add(number * number);
        }

        return result;
    }
}

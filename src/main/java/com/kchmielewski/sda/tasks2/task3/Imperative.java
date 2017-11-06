package com.kchmielewski.sda.tasks2.task3;

import java.util.ArrayList;
import java.util.List;

public class Imperative implements OnlyPositive {
    @Override
    public List<Integer> positive(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>(numbers.size());
        for (Integer number : numbers) {
            if (number > 0) {
                result.add(number);
            }
        }

        return result;
    }
}

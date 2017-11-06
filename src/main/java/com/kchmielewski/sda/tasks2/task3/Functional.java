package com.kchmielewski.sda.tasks2.task3;

import java.util.List;
import java.util.stream.Collectors;

public class Functional implements OnlyPositive {
    @Override
    public List<Integer> positive(List<Integer> numbers) {
        return numbers.stream().filter(p -> p > 0).collect(Collectors.toList());
    }
}

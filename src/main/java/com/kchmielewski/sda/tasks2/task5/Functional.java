package com.kchmielewski.sda.tasks2.task5;

import java.util.List;
import java.util.stream.Collectors;

public class Functional implements Mean {
    @Override
    public double integersMean(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.averagingInt(i -> i));
    }
}

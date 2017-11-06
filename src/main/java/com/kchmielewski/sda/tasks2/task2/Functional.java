package com.kchmielewski.sda.tasks2.task2;

import java.util.List;
import java.util.stream.Collectors;

public class Functional implements Squares {
    @Override
    public List<Integer> squares(List<Integer> numbers) {
        return numbers.stream().map(n -> n * n).collect(Collectors.toList());
    }
}

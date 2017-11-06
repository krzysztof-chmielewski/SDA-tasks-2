package com.kchmielewski.sda.tasks2.task4;

import java.util.List;
import java.util.stream.Collectors;

public class Functional implements FlatMap {
    @Override
    public <T> List<T> flatMap(List<List<T>> numbers) {
        return numbers.stream().flatMap(List::stream).collect(Collectors.toList());
    }
}

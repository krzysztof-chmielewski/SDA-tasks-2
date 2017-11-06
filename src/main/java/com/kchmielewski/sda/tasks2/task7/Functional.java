package com.kchmielewski.sda.tasks2.task7;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Functional implements Grouping {
    @Override
    public <T> Map<T, Long> counting(List<T> elements) {
        return elements.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }
}

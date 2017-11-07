package com.kchmielewski.sda.tasks2.task8;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Functional implements AdvancedGrouping {
    @Override
    public Map<String, List<Integer>> grouping(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.groupingBy(i -> i.toString().substring(0, 1), Collectors.toList()));
    }
}

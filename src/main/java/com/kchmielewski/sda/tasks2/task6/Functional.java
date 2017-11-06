package com.kchmielewski.sda.tasks2.task6;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Functional implements Partitioning {
    @Override
    public Map<Boolean, List<Integer>> partitionEvenWithOdds(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
    }
}

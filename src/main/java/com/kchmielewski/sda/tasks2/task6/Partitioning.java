package com.kchmielewski.sda.tasks2.task6;

import java.util.List;
import java.util.Map;

public interface Partitioning {
    Map<Boolean, List<Integer>> partitionEvenWithOdds(List<Integer> numbers);
}

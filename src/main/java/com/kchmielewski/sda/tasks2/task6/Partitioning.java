package com.kchmielewski.sda.tasks2.task6;

import java.util.List;
import java.util.Map;

public interface Partitioning {
    /**
     * Returns {@link Map} that reflects effect of partitioning given {@link List numbers} based on whether given
     * {@code integer} is even. Partitioning means that resulting {@code map} will contains two entries:
     * [true=[list of even numbers], false=[list of odd numbers]], e.g. for {@code list} of (1, 2, 3, 4, 5, 5, 9, 12)
     * the result should be: [true=[2, 4, 12], false=[1, 3, 5, 5, 9]
     *
     * @param numbers numbers to be partitioned
     * @return the map which is effect of partitioning given {@code numbers}
     */
    Map<Boolean, List<Integer>> partitionEvenWithOdds(List<Integer> numbers);
}

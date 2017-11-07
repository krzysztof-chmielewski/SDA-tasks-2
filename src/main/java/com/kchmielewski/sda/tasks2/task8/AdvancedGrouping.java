package com.kchmielewski.sda.tasks2.task8;

import java.util.List;
import java.util.Map;

public interface AdvancedGrouping {
    /**
     * Returns {@link Map map} that is result of grouping given {@code numbers} based od the very first digit.
     * It means, that for {@link List list} of [1, 11, 3, 10001, 3456, 4, 5, 3] the result should be:
     * ["1"=[1, 11, 10001], "3"=[3, 3456, 3], "4"=[4], "5"=5].
     *
     * @param numbers to be grouped based on first digit
     * @return {@code map} that contains given {@code numbers} grouped by their first digit
     */
    Map<String, List<Integer>> grouping(List<Integer> numbers);
}

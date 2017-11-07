package com.kchmielewski.sda.tasks2.task3;

import java.util.List;

public interface OnlyPositive {
    /**
     * Filters given {@link List link} retaining only positive {@link Integer integers}.
     *
     * @param numbers {@code list} to be filtered
     * @return {@code list} containing only positive numbers
     */
    List<Integer> positive(List<Integer> numbers);
}

package com.kchmielewski.sda.tasks2.task5;

import java.util.List;

public interface Mean {
    /**
     * Returns mean value for provided {@code numbers}. For empty list should return 0.
     *
     * @param numbers to calculate mean based on
     * @return mean value or 0 if {@code list} is empty
     */
    double integersMean(List<Integer> numbers);
}

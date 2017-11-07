package com.kchmielewski.sda.tasks2.task4;

import java.util.List;

public interface FlatMap {
    /**
     * Returns flattened {@code numbers}. That means that for {@link List list} that contains two lists:
     * [[1, 2, 3], [6, 7, 2]] the result should be one list: [1, 2, 3, 6, 7, 2]
     *
     * @param numbers {@code list} to be flattened
     * @param <T>     type of the elements of the {@code list}
     * @return flattened {@code list}
     */
    <T> List<T> flatMap(List<List<T>> numbers);
}

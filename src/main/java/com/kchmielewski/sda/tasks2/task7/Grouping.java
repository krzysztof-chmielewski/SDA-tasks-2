package com.kchmielewski.sda.tasks2.task7;

import java.util.List;
import java.util.Map;

public interface Grouping {
    /**
     * Returns {@link Map map} that is effect of grouping elements of given {@link List list} based on numbers of
     * occurrences for each element in that {@code list}. That means that for {@code list} of
     * ["abc", "abc", "qwe", "example", "another", "example", "example"] the result should be
     * ["abc"=2, "qwe"=1, "example"=3, "another=1].
     *
     * @param elements to be grouped based on count of occurrences
     * @param <T>      type of the elements in the {@code list}
     * @return the {@code map} that reflects the result of grouping given {@code elements} based on count of occurrences
     */
    <T> Map<T, Long> counting(List<T> elements);
}

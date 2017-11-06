package com.kchmielewski.sda.tasks2.task7;

import java.util.List;
import java.util.Map;

public interface Grouping {
    <T> Map<T, Long> counting(List<T> elements);
}

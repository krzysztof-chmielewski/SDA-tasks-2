package com.kchmielewski.sda.tasks2.task4;

import java.util.List;

public interface FlatMap {
    <T> List<T> flatMap(List<List<T>> numbers);
}

package com.kchmielewski.sda.tasks2.task4;

import java.util.ArrayList;
import java.util.List;

public class Imperative implements FlatMap {
    @Override
    public <T> List<T> flatMap(List<List<T>> numbers) {
        List<T> result = new ArrayList<>();
        for (List<T> integers : numbers) {
            result.addAll(integers);
        }

        return result;
    }
}

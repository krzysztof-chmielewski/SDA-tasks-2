package com.kchmielewski.sda.tasks2.task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Imperative implements CopyList {
    @Override
    public <T> List<T> copy(List<T> list) {
        List<T> result = new ArrayList<>(list.size());
        for (T t: list) {
            result.add(t);
        }

        return result;
    }
}

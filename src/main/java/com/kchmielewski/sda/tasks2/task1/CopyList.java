package com.kchmielewski.sda.tasks2.task1;

import java.util.List;

public interface CopyList {
    /**
     * Returns shallow copy of this {@link List}. It is required that returned {@code list} IS NOT the same instance.
     *
     * @param list list to be copied
     * @param <T>  type of the elements of the list
     * @return shallow copy of given {@code list}
     */
    <T> List<T> copy(List<T> list);
}

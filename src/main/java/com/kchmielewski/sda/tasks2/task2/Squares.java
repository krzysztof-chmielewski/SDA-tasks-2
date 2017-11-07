package com.kchmielewski.sda.tasks2.task2;

import java.util.List;

public interface Squares {
    /**
     * Returns new {@link List list} with each element raised to the square.
     *
     * @param integers {@code list} of {@link Integer integers}
     * @return {@code list} containing integers raised to the square
     */
    List<Integer> squares(List<Integer> integers);
}

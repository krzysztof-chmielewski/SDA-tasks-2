package com.kchmielewski.sda.tasks2.task2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class Task2Test {
    private final Squares tested;

    Task2Test(Squares tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyEmptyIsReturned() {
        assertThat(tested.squares(Collections.emptyList())).isEmpty();
    }

    @Test
    public void forOneElementOneSquareIsReturned() {
        assertThat(tested.squares(Collections.singletonList(3))).containsExactly(9);
    }

    @Test
    public void forThreeElementReturnsThreeSquaresAreReturned() {
        assertThat(tested.squares(Arrays.asList(5, 1, 12))).containsExactly(25, 1, 144);
    }
}

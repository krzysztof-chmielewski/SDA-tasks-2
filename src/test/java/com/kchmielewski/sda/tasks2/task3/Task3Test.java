package com.kchmielewski.sda.tasks2.task3;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class Task3Test {
    private final OnlyPositive tested;

    Task3Test(OnlyPositive tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyEmptyIsReturned() {
        assertThat(tested.positive(Collections.emptyList())).isEmpty();
    }

    @Test
    public void forOnePositiveOneItIsReturned() {
        assertThat(tested.positive(Collections.singletonList(1))).containsExactly(1);
    }

    @Test
    public void forZeroEmptyIsReturned() {
        assertThat(tested.positive(Collections.singletonList(0))).isEmpty();
    }

    @Test
    public void forOneNegativeEmptyIsReturned() {
        assertThat(tested.positive(Collections.singletonList(-1))).isEmpty();
    }

    @Test
    public void forMixedOnlyPositiveAreRetained() {
        assertThat(tested.positive(Arrays.asList(12, -5, 0, 32, -34, -99))).containsExactly(12, 32);
    }
}

package com.kchmielewski.sda.tasks2.task5;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class Task5Test {
    private final Mean tested;

    Task5Test(Mean tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyReturnsZero() {
        assertThat(tested.integersMean(Collections.emptyList())).isEqualTo(0.0);
    }

    @Test
    public void forOneElementItIsReturned() {
        assertThat(tested.integersMean(Collections.singletonList(123))).isEqualTo(123.0);
    }

    @Test
    public void forTwoElementsTheirMeanIsReturned() {
        assertThat(tested.integersMean(Arrays.asList(1, 4))).isEqualTo(2.5);
    }
}

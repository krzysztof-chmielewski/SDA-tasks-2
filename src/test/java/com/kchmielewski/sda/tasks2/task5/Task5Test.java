package com.kchmielewski.sda.tasks2.task5;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertThat;

public abstract class Task5Test {
    private final Mean tested;

    Task5Test(Mean tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyReturnsZero() throws Exception {
        assertThat(tested.integersMean(Collections.emptyList()), IsEqual.equalTo(0.0));
    }

    @Test
    public void forOneElementItIsReturned() throws Exception {
        assertThat(tested.integersMean(Collections.singletonList(123)), IsEqual.equalTo(123.0));
    }

    @Test
    public void forTwoElementsTheirMeanIsReturned() throws Exception {
        assertThat(tested.integersMean(Arrays.asList(1, 4)), IsEqual.equalTo(2.5));
    }
}

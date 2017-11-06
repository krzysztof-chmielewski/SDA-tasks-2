package com.kchmielewski.sda.tasks2.task3;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertThat;

public abstract class Task3Test {
    private final OnlyPositive tested;

    Task3Test(OnlyPositive tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyEmptyIsReturned() throws Exception {
        assertThat(tested.positive(Collections.emptyList()), IsEqual.equalTo(Collections.emptyList()));
    }

    @Test
    public void forOnePositiveOneItIsReturned() throws Exception {
        assertThat(tested.positive(Collections.singletonList(1)), IsEqual.equalTo(Collections.singletonList(1)));
    }

    @Test
    public void forZeroEmptyIsReturned() throws Exception {
        assertThat(tested.positive(Collections.singletonList(0)), IsEqual.equalTo(Collections.emptyList()));
    }

    @Test
    public void forOneNegativeEmptyIsReturned() throws Exception {
        assertThat(tested.positive(Collections.singletonList(-1)), IsEqual.equalTo(Collections.emptyList()));
    }

    @Test
    public void forMixedOnlyPositiveAreRetained() throws Exception {
        assertThat(tested.positive(Arrays.asList(12, -5, 0, 32, -34, -99)), IsEqual.equalTo(Arrays.asList(12, 32)));
    }
}

package com.kchmielewski.sda.tasks2.task2;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertThat;

public abstract class Task2Test {
    private final Squares tested;

    Task2Test(Squares tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyEmptyIsReturned() throws Exception {
        assertThat(tested.squares(Collections.emptyList()), IsEqual.equalTo(Collections.emptyList()));
    }

    @Test
    public void forOneElementOneSquareIsReturned() throws Exception {
        assertThat(tested.squares(Collections.singletonList(3)), IsEqual.equalTo(Collections.singletonList(9)));
    }

    @Test
    public void forThreeElementReturnsThreeSquaresAreReturned() throws Exception {
        assertThat(tested.squares(Arrays.asList(5, 1, 12)), IsEqual.equalTo(Arrays.asList(25, 1, 144)));
    }
}

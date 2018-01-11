package com.kchmielewski.sda.tasks2.task4;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class Task4Test {
    private final FlatMap tested;

    Task4Test(FlatMap tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyEmptyIsReturned() {
        assertThat(tested.flatMap(Collections.emptyList())).isEmpty();
    }

    @Test
    public void forListOfEmptyListEmptyListIsReturned() {
        assertThat(tested.flatMap(Arrays.asList(Collections.emptyList(), Collections.emptyList()))).isEmpty();
    }

    @Test
    public void forOneNonEmptyListReturnsItsValues() {
        assertThat(tested.flatMap(Arrays.asList(Collections.emptyList(), Arrays.asList(1, 2, "qwe")))).containsExactly(1, 2, "qwe");
    }

    @Test
    public void forTwoNonEmptyListsReturnsThemMerged() {
        assertThat(tested.flatMap(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList("a", "b")))).containsExactly(1, 2, 3, "a", "b");
    }
}

package com.kchmielewski.sda.tasks2.task4;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertThat;

public abstract class Task4Test {
    private final FlatMap tested;

    Task4Test(FlatMap tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyEmptyIsReturned() throws Exception {
        assertThat(tested.flatMap(Collections.emptyList()), IsEqual.equalTo(Collections.emptyList()));
    }

    @Test
    public void forListOfEmptyListEmptyListIsReturned() throws Exception {
        assertThat(tested.flatMap(Arrays.asList(Collections.emptyList(), Collections.emptyList())), IsEqual.equalTo(Collections.emptyList()));
    }

    @Test
    public void forOneNonEmptyListReturnsItsValues() throws Exception {
        assertThat(tested.flatMap(Arrays.asList(Collections.emptyList(), Arrays.asList(1, 2, "qwe"))), IsEqual.equalTo(Arrays.asList(1, 2, "qwe")));
    }

    @Test
    public void forTwoNonEmptyListsReturnsThemMerged() throws Exception {
        assertThat(tested.flatMap(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList("a", "b"))), IsEqual.equalTo(Arrays.asList(1, 2, 3, "a", "b")));
    }
}

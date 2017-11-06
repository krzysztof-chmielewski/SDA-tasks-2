package com.kchmielewski.sda.tasks2.task1;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

import static org.junit.Assert.assertThat;

public abstract class Task1Test {
    private final CopyList tested;

    Task1Test(CopyList tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyEmptyIsReturned() throws Exception {
        assertThat(tested.copy(Collections.emptyList()), IsEqual.equalTo(Collections.emptyList()));
    }

    @Test
    public void forOneElementThisOneElementIsReturned() throws Exception {
        assertThat(tested.copy(Collections.singletonList("Qwe")), IsEqual.equalTo(Collections.singletonList("Qwe")));
    }

    @Test
    public void forThreeElementReturnsThreeElementList() throws Exception {
        assertThat(tested.copy(Arrays.asList("asd", 123, 9123f)), IsEqual.equalTo(Arrays.asList("asd", 123, 9123f)));
    }
}

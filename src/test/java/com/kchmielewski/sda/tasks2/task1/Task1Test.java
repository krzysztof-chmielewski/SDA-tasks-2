package com.kchmielewski.sda.tasks2.task1;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class Task1Test {
    private final CopyList tested;

    Task1Test(CopyList tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyEmptyIsReturned() {
        assertThat(tested.copy(Collections.emptyList())).isEmpty();
    }

    @Test
    public void forOneElementThisOneElementIsReturned() {
        assertThat(tested.copy(Collections.singletonList("Qwe"))).containsExactly("Qwe");
    }

    @Test
    public void forThreeElementReturnsThreeElementList() {
        assertThat(tested.copy(Arrays.asList("asd", 123, 9123f))).containsExactly("asd", 123, 9123f);
    }

    @Test
    public void doesNotReturnsSameInstance() {
        List<String> list = Collections.singletonList("Qwe");
        assertThat(tested.copy(Collections.singletonList("Qwe"))).isNotSameAs(list);
    }
}

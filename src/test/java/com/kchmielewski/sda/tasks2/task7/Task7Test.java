package com.kchmielewski.sda.tasks2.task7;

import org.hamcrest.core.IsEqual;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertThat;

public abstract class Task7Test {
    private final Grouping tested;

    Task7Test(Grouping tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyReturnsEmpty() throws Exception {
        assertThat(tested.counting(Collections.emptyList()), IsEqual.equalTo(Collections.emptyMap()));
    }

    @Test
    public void forOneElementReturnsOneElementWithOneValue() throws Exception {
        assertThat(tested.counting(Collections.singletonList("QWe")), IsEqual.equalTo(Collections.singletonMap("QWe", 1L)));
    }

    @Test
    public void forTwoSameElementsReturnsOneElementWithTwoValue() throws Exception {
        assertThat(tested.counting(Arrays.asList("QWe", "QWe")), IsEqual.equalTo(Collections.singletonMap("QWe", 2L)));
    }

    @Test
    public void forTwoDifferentElementsReturnsTwoElementsWithOneValue() throws Exception {
        Map<String, Long> result = new HashMap<>();
        result.put("QWe", 1L);
        result.put("ASD", 1L);
        assertThat(tested.counting(Arrays.asList("QWe", "ASD")), IsEqual.equalTo(result));
    }

    @Test
    public void forFiveDifferentElementsReturnsProperMap() throws Exception {
        Map<String, Long> result = new HashMap<>();
        result.put("QWe", 3L);
        result.put("ASD", 1L);
        result.put("---", 2L);
        assertThat(tested.counting(Arrays.asList("QWe", "QWe", "---", "ASD", "QWe", "---")), IsEqual.equalTo(result));
    }
}

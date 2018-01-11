package com.kchmielewski.sda.tasks2.task7;

import org.junit.Test;

import java.util.*;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class Task7Test {
    private final Grouping tested;

    Task7Test(Grouping tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyReturnsEmpty() {
        assertThat(tested.counting(Collections.emptyList())).isEmpty();
    }

    @Test
    public void forOneElementReturnsOneElementWithOneValue() {
        assertThat(tested.counting(Collections.singletonList("QWe"))).containsExactly(new AbstractMap.SimpleImmutableEntry<>("QWe", 1L));
    }

    @Test
    public void forTwoSameElementsReturnsOneElementWithTwoValue() {
        assertThat(tested.counting(Arrays.asList("QWe", "QWe"))).containsExactly(new AbstractMap.SimpleImmutableEntry<>("QWe", 2L));
    }

    @Test
    public void forTwoDifferentElementsReturnsTwoElementsWithOneValue() {
        Map<String, Long> result = new HashMap<>();
        result.put("QWe", 1L);
        result.put("ASD", 1L);
        assertThat(tested.counting(Arrays.asList("QWe", "ASD"))).isEqualTo(result);
    }

    @Test
    public void forFiveDifferentElementsReturnsProperMap() {
        Map<String, Long> result = new HashMap<>();
        result.put("QWe", 3L);
        result.put("ASD", 1L);
        result.put("---", 2L);
        assertThat(tested.counting(Arrays.asList("QWe", "QWe", "---", "ASD", "QWe", "---"))).isEqualTo(result);
    }
}

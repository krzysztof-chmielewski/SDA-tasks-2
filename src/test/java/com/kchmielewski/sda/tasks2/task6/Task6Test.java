package com.kchmielewski.sda.tasks2.task6;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public abstract class Task6Test {
    private final Partitioning tested;
    private final Map<Boolean, List<Integer>> emptyMap = new HashMap<>(Stream.<Integer>of().collect(Collectors.partitioningBy(i -> i % 2 == 0)));

    Task6Test(Partitioning tested) {
        this.tested = tested;
    }

    @Test
    public void forEmptyReturnsZero() {
        assertThat(tested.partitionEvenWithOdds(Collections.emptyList())).isEqualTo(emptyMap);
    }

    @Test
    public void forOneEvenReturnsSingleElementMap() {
        emptyMap.put(true, Collections.singletonList(2));
        assertThat(tested.partitionEvenWithOdds(Collections.singletonList(2))).isEqualTo(emptyMap);
    }

    @Test
    public void forOneOddReturnsSingleElementMap() {
        emptyMap.put(false, Collections.singletonList(3));
        assertThat(tested.partitionEvenWithOdds(Collections.singletonList(3))).isEqualTo(emptyMap);
    }

    @Test
    public void forFiveElementListPartitionsCorrectly() {
        Map<Boolean, List<Integer>> result = new HashMap<>();
        result.put(true, Arrays.asList(2, 4, 6));
        result.put(false, Arrays.asList(1, 3));
        assertThat(tested.partitionEvenWithOdds(Arrays.asList(1, 2, 3, 4, 6))).isEqualTo(result);
    }
}
